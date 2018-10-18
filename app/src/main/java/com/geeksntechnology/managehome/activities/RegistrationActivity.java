package com.geeksntechnology.managehome.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.geeksntechnology.managehome.R;
import com.geeksntechnology.managehome.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = RegistrationActivity.class.getSimpleName();

    @BindView(R2.id.register_userName)
    TextInputEditText mRegisterUserName;
    @BindView(R2.id.register_email)
    TextInputEditText mRegisterEmail;
    @BindView(R2.id.register_password)
    TextInputEditText mRegisterPassword;
    @BindView(R.id.button_register)
    Button mButtonRegister;
    @BindView(R.id.textViewLogin)
    TextView mTextViewLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);

        mButtonRegister.setOnClickListener(this);
        mTextViewLogin.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onClick(View v) {
        if (v == mTextViewLogin) {
            Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        }

        if (v == mButtonRegister) {
            createNewUser();
        }
    }

    private void createNewUser() {
        final String userName = mRegisterUserName.getText().toString().trim();
        final String email = mRegisterEmail.getText().toString().trim();

        String password = mRegisterPassword.getText().toString().trim();
    }
}