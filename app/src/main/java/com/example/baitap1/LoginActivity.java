package com.example.baitap1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edtUser, edtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnDoLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // simple fake auth: any non-empty -> success
                String u = edtUser.getText().toString().trim();
                String p = edtPass.getText().toString().trim();
                if (u.length() > 0 && p.length() > 0) {
                    startActivity(new Intent(LoginActivity.this, PaymentActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Nhập user/password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
