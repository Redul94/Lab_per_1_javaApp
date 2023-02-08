package com.example.lab_per1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText myText,myText2;
//    EditText myText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = findViewById(R.id.insertText);
        myText2 = findViewById(R.id.insertText2);

    }

    public void toastFunction(View view) {
        String name = myText.getText().toString();
        String name2 = myText2.getText().toString();
        Toast.makeText(this, "Welcome" + name + name2, Toast.LENGTH_SHORT).show();
    }
}