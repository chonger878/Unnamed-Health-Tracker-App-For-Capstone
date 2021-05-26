package com.example.unnamedhealthtrackerappforcapstone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_btn = findViewById(R.id.login_btn);
        Button new_user_btn = findViewById(R.id.new_user_btn);

        login_btn.setOnClickListener(view -> {
            Intent toLogin = new Intent(MainActivity.this, UserLogin.class);
            startActivity(toLogin);
        });

        new_user_btn.setOnClickListener(view -> {
            Intent toNewUser = new Intent(MainActivity.this, NewUserFormActivity.class);
            startActivity(toNewUser);
        });




    }


}