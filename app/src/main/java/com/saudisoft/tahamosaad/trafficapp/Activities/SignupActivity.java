package com.saudisoft.tahamosaad.trafficapp.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.saudisoft.tahamosaad.trafficapp.R;

public class SignupActivity extends Activity implements View.OnClickListener {
    private FirebaseAuth mAuth;
    EditText editTextEmail,editTextPassword,editTextPassword_conf;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_signup );

        editTextEmail = (EditText) findViewById(R.id.email_new);
        editTextPassword = (EditText) findViewById(R.id.password_new);
        editTextPassword_conf = (EditText) findViewById(R.id.password_conf);
        progressBar = (ProgressBar) findViewById(R.id.signup_progress);

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.sign_up_button).setOnClickListener(this);
        findViewById(R.id.cancel_btn).setOnClickListener(this);
    }
    private void registerUser() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String password_conf = editTextPassword_conf.getText().toString().trim();

        if (email.isEmpty()) {
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextEmail.setError("Please enter a valid email");
            editTextEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            editTextPassword.setError( "Minimum lenght of password should be 6" );
            editTextPassword.requestFocus();
            return;
        }
        if (!password_conf.equals( password )) {
            editTextPassword_conf.setError( "Password are not matched" );
            editTextPassword_conf.requestFocus();
            return;
        }


        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {
                    finish();
                    startActivity(new Intent(SignupActivity.this, MainActivity.class));
                } else {

                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_up_button:
                registerUser();
                break;

            case R.id.cancel_btn:
                finish();
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
}
