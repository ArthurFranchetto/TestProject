package com.example.arthurf.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class Login extends AppCompatActivity {

    EditText username = (EditText)findViewById(R.id.editText1);
    EditText password = (EditText)findViewById(R.id.editText2);

    public void login(View view){
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){

            //correcct password
        }else{
            //wrong password
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
