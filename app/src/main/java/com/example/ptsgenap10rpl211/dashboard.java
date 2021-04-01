package com.example.ptsgenap10rpl211;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class dashboard extends AppCompatActivity {


    private RecyclerView recyclerView;
    private AccountAdapter adapter;
    private ArrayList<Account> accountArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);

        addData();
        adapter = new AccountAdapter(accountArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(dashboard.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        accountArrayList = new ArrayList<>();
        accountArrayList.add(new Account("Sari","11032451","sariri@gmail.com"));
        accountArrayList.add(new Account("Burhan","11043567","burhanan@gmail.com"));
        accountArrayList.add(new Account("Nusa","11046647","nusantaraga@gmail.com"));
    }
}