package com.example.a12;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    private EditText login;
    private EditText mail;
    private EditText passwordNumOne;
    private EditText passwordNumTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
    }
    public void goAuth(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                startNewAc();
                break;
        }
    }
    public void startNewAc() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void SUCheck(View v) {
        login = (EditText) findViewById(R.id.editTextTextPersonName);
        mail = (EditText) findViewById(R.id.editTextTextPersonName4);
        passwordNumOne = (EditText) findViewById(R.id.editTextTextPassword);
        passwordNumTwo = (EditText) findViewById(R.id.editTextTextPassword3);
        Toast toast;
        if ((login.length()==0)||(mail.length()==0)||(passwordNumOne.length()==0)||(passwordNumTwo.length()==0)) {
            toast = Toast.makeText(this, "Введены не все данные!", Toast.LENGTH_LONG);
        }
        else if(!passwordNumOne.getText().toString().equals(passwordNumTwo.getText().toString())) {
            toast = Toast.makeText(this, "Пароли не совпадают!", Toast.LENGTH_LONG);
        }
        else {
            toast = Toast.makeText(this, "Регистрация прошла успешно!", Toast.LENGTH_LONG);
            startNewAc();
        }
        toast.show();
    }
}
