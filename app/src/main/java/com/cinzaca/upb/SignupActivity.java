package com.cinzaca.upb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private EditText emailEditText, fullnameEditText, passwordEditText;
    private Button createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        helperMethod();

        openLoginActivity();
    }


    private void helperMethod() {
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        fullnameEditText = (EditText) findViewById(R.id.fullnameEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        createAccount = (Button) findViewById(R.id.loginButton);
    }

    public void openLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}