package com.example.passdataloginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etNo, etAge, etBio, etLoc;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            etName = findViewById(R.id.etName);
            etNo = findViewById(R.id.PersonPhone);
            etAge = findViewById(R.id.etAge);
            etBio = findViewById(R.id.PersonBio);
            etLoc = findViewById(R.id.PesronLocation);
            btnSubmit = findViewById(R.id.btnSubmit);
            btnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = etName.getText().toString().trim();
                    String Age = etAge.getText().toString().trim();
                    String Phno = etNo.getText().toString().trim();
                    String Bio = etBio.getText().toString().trim();
                    String Loc = etLoc.getText().toString().trim();
                    if (name.equals("")) {
                        Toast.makeText(MainActivity.this, "Name is missing", Toast.LENGTH_SHORT).show();
                    } else if (Age.equals("")) {
                        Toast.makeText(MainActivity.this, "Age is missing", Toast.LENGTH_SHORT).show();
                    } else if (Phno.equals("")) {
                        Toast.makeText(MainActivity.this, "Number is missing", Toast.LENGTH_SHORT).show();
                    } else if (Bio.equals("")) {
                        Toast.makeText(MainActivity.this, "Bio is missing", Toast.LENGTH_SHORT).show();
                    } else if (Loc.equals("")) {
                        Toast.makeText(MainActivity.this, "Location is missing", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        intent.putExtra("name", name);
                        intent.putExtra("age", Age);
                        intent.putExtra("Phno", Phno);
                        intent.putExtra("Bio", Bio);
                        intent.putExtra("Location", Loc);


                        startActivity(intent);
                    }
                }
            });
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Unexpected Crash, Restart the App", Toast.LENGTH_SHORT).show();
        }
    }
}