package com.saudisoft.tahamosaad.trafficapp.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.saudisoft.tahamosaad.trafficapp.R;

public class LoginActivity extends AppCompatActivity {
    private EditText mUser_name;
    private FirebaseAuth mAuth;
    private AutoCompleteTextView mEmail;
    private EditText mPassword;
    private ProgressBar progressBar;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        mAuth = FirebaseAuth.getInstance();

        mUser_name=(EditText)findViewById( R.id.user_name );
        mEmail = (AutoCompleteTextView) findViewById( R.id.email );
        mPassword = (EditText) findViewById( R.id.password );
        progressBar = (ProgressBar) findViewById(R.id.signin_progress);

        Button mSignInButton = (Button) findViewById( R.id.sign_in_button );
        mSignInButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userLogin();
                Save();
            }
        } );

        Button mSignupButton = (Button)findViewById( R.id.register_button );
        mSignupButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);

            }
        } );

    }
    private void userLogin() {
        String email = mEmail.getText().toString().trim();
        String password = mPassword.getText().toString().trim();

        if (email.isEmpty()) {
            mEmail.setError("Email is required");
            mEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            mEmail.setError("Please enter a valid email");
            mEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            mPassword.setError("Password is required");
            mPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            mPassword.setError("Minimum lenght of password should be 6");
            mPassword.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {
                    finish();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }
    @Override
    public void onStart() {
        super.onStart();

        if (mAuth.getCurrentUser() != null) {
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }
    }
public  void Save()
{
    //user_data = mydata , Mode_private => use data only on my app
    SharedPreferences sharedPreferences = getSharedPreferences( "User_data", Context.MODE_PRIVATE );
    //edit my data which i get
    SharedPreferences.Editor editor = sharedPreferences.edit();
    //put string take two value(Key ,value)
    editor.putString("name", mUser_name.getText().toString());
    editor.putString( "email",mEmail.getText().toString());
    editor.commit();
}
}
