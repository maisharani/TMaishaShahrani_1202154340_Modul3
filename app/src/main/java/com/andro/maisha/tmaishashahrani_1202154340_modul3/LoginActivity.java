package com.andro.maisha.tmaishashahrani_1202154340_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        btnLogin = (Button) findViewById(R.id.login);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE")) {
                    //jika login berhasil
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Login Success!")
                            .setNegativeButton("OK", null).create().show();
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    intent.putExtra("username", usernameKey);
                    LoginActivity.this.startActivity(intent);

                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Login Fail!")
                            .setNegativeButton("Retry..", null).create().show();
                }
            }
        });

    }
}
