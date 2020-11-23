package com.cinzaca.upb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText, fullnameEditText, passwordEditText;
    private Button loginButton;
    private TextView signupTextClickable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        helperMethod();

        signupTextClickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignupActivity();
            }
        });
    }

    private void helperMethod() {
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        fullnameEditText = (EditText) findViewById(R.id.fullnameEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        loginButton = (Button) findViewById(R.id.loginButton);

        signupTextClickable = (TextView) findViewById(R.id.signupTextClickable);
    }

    public void openSignupActivity() {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

}