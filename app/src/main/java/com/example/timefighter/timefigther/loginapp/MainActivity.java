package com.example.timefighter.timefigther.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView passowrd = (TextView) findViewById(R.id.pass);
        MaterialButton loginButton = (MaterialButton) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && passowrd.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "LOGIN FAIL!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}