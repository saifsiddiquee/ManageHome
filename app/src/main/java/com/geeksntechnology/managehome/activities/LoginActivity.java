package com.geeksntechnology.managehome;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;

    //Initializing View
    @BindView(R2.id.login_email)
    TextInputEditText mLoginEmail;
    @BindView(R2.id.login_password)
    TextInputEditText mLoginPassword;
    @BindView(R2.id.button_Login)
    Button mButtonLogin;
    @BindView(R2.id.textViewCreateAccount)
    TextView mCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Binding View
        ButterKnife.bind(this);
        mButtonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mCreateAccount){
            Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
            startActivity(intent);
            finish();
        }
    }
}