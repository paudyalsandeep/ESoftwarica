package com.example.esoftwarica.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.esoftwarica.MainActivity;
import com.example.esoftwarica.R;
import com.google.android.material.textfield.TextInputLayout;


public class LoginActivity extends AppCompatActivity {

    private TextInputLayout etUsername;
    TextInputLayout etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername=findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etUsername.getEditText().getText().toString().isEmpty())
                {
                    etUsername.setError("Username cannot be empty");
                    return;
                }
                else
                {
                    etUsername.setError(null);
                }

                if (etPassword.getEditText().getText().toString().isEmpty())
                {
                    etPassword.setError("Password cannot be empty");
                    return;
                }
                else
                {
                    etPassword.setError(null);
                }



                if (etUsername.getEditText().getText().toString().equals("admin")&&etPassword.getEditText().getText().toString().equals("admin"))
                {
                    Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Incorrect Details", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    /*private boolean validateUsername()
    {
        String username=etUsername.getEditText().toString().trim();

        if (username.isEmpty())
        {
            etUsername.setError("Username cannot be empty");
            return false;
        }
        else
        {
            etUsername.setError(null);
            return true;
        }
    }

    private boolean validatePassword()
    {
        String password=etPassword.getEditText().toString().trim();

        if (password.isEmpty())
        {
            etPassword.setError("Password cannot be empty");
            return false;
        }
        else
        {
            etPassword.setError(null);
            return true;
        }
    }*/

}
