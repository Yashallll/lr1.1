package com.example.a12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NewActivity2 extends AppCompatActivity {
    private TextView log;
    private TextView pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);
        log = (TextView) findViewById(R.id.textView3);
        pas= (TextView) findViewById(R.id.textView5);
        String txtlog = getIntent().getStringExtra("login");
        String txtpas = getIntent().getStringExtra("pass");
        log.setText(log.getText().toString()+txtlog);
        pas.setText(pas.getText().toString()+txtpas);
    }
    public void goToAuth1(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            default:
                    break;
        }
    }

}

