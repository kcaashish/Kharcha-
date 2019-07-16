package com.aashish.app.kharcha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginButton_onClick(View v) {
        Intent toLoginPage = new Intent(this, LoginActivity.class);
        startActivity(toLoginPage);
    }

    public void signUpButton_onClick(View v) {
        Intent toSignUpPage = new Intent(this, SignUpActivity.class);
        startActivity(toSignUpPage);
    }

}
