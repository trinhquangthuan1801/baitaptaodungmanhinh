package com.example.baitap1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BankActivity extends AppCompatActivity {
    Button btnConfirm;
    TextView tvAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        tvAmount = findViewById(R.id.tvAmount);
        btnConfirm = findViewById(R.id.btnConfirm);

        String amount = getIntent().getStringExtra("amount");
        if (amount == null) amount = "0";
        tvAmount.setText("Số tiền: " + amount + " VND");

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BankActivity.this, SuccessActivity.class));
            }
        });
    }
}
