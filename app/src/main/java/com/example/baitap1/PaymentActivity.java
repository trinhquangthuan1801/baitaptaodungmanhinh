package com.example.baitap1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {
    EditText edtAmount;
    Button btnPay;
    TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        edtAmount = findViewById(R.id.edtAmount);
        btnPay = findViewById(R.id.btnPay);
        tvInfo = findViewById(R.id.tvInfo);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edtAmount.getText().toString().trim();
                if (s.length() == 0) {
                    Toast.makeText(PaymentActivity.this, "Nhập số tiền", Toast.LENGTH_SHORT).show();
                    return;
                }
                // pass to BankActivity
                Intent i = new Intent(PaymentActivity.this, BankActivity.class);
                i.putExtra("amount", s);
                startActivity(i);
            }
        });
    }
}
