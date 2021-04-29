package com.example.ptsgenap10rpl211;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private Bundle bundle;
    private String nama,email,absen;
    private TextView tvnama,tvemail,tvabsen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvnama = findViewById(R.id.tvNama);
        tvemail = findViewById(R.id.tvEmail);
        tvabsen = findViewById(R.id.tvAbsen);

        bundle = getIntent().getExtras();
        if(bundle != null){
            nama = bundle.getString("nama");
            email = bundle.getString("email");
            absen = bundle.getString("absen");
        }

        tvnama.setText("Nama    : "+nama);
        tvemail.setText("Email  : "+email);
        tvabsen.setText("No. Absen  : "+absen);
    }
}