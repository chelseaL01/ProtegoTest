package com.example.protego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.example.protego.NAME"; //serves the role of a key of the intent.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void nextScreen(View view){
        Intent intent = new Intent(this, PatientDashboard.class);
        EditText email_edit = (EditText) findViewById(R.id.Email_Sign_In_Text_Input);
        EditText password_edit = (EditText) findViewById(R.id.Password_Sign_In_Text_Input);
        String name = email_edit.getText().toString();
        String password = password_edit.getText().toString();
        if(!name.isEmpty() && name.contains("@") && !password.isEmpty()) {
            intent.putExtra(EXTRA_NAME, name); //assigns the value to the key of the intent
            startActivity(intent); //starts an instance of the Main Activity class
        }
    }

}