package com.example.a12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText login;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (EditText) findViewById(R.id.textView3);
        pass= (EditText) findViewById(R.id.editTextTextPassword2);
    }

    public void goToSignUp(View v) {
        switch (v.getId()) {
            case R.id.textView4:
                Intent intent = new Intent(this,NewActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void goDoneAuth(View v) {
        switch (v.getId()) {
            case R.id.button3:
                Intent intent = new Intent(this,NewActivity2.class);
                intent.putExtra("login",login.getText().toString());
                intent.putExtra("pass",pass.getText().toString());
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}