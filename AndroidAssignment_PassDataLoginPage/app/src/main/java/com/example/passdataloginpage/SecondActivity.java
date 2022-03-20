package com.example.passdataloginpage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvName, tvAge, tvPhno, tvbio, tvLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);
        tvPhno = findViewById(R.id.tvphno);
        tvbio = findViewById(R.id.tvBio);
        tvLocation = findViewById(R.id.tvlocation);
        Intent intent = getIntent();
        tvName.setText(intent.getStringExtra("name"));
        tvAge.setText(intent.getStringExtra("age"));
        tvPhno.setText(intent.getStringExtra("Phno"));
        tvbio.setText(intent.getStringExtra("Bio"));
        tvLocation.setText(intent.getStringExtra("Location"));



    }
}