package com.example.ptsgenap10rpl211;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;

public class dashboard extends AppCompatActivity {
    private MaterialToolbar btnback;
    private RecyclerView recyclerView;
    private PostAdapter adapter;
    private ArrayList<Post> postArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);



        addData();
        adapter = new PostAdapter(postArrayList, new PostAdapter.Callback() {
            @Override
            public void onClick(int position) {
                Intent move = new Intent(getApplicationContext(),DetailActivity.class);
                Post mypost = postArrayList.get(position);
                move.putExtra("nama", mypost.getNama());
                move.putExtra("email", mypost.getEmail());
                move.putExtra("absen", mypost.getAbsen());
                startActivity(move);
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(dashboard.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        postArrayList = new ArrayList<>();
        postArrayList.add(new Post("Sari","sarinakcom@gmail.com","1"));
        postArrayList.add(new Post("Burhan","burhannihbos@gmail.com","2"));
        postArrayList.add(new Post("Nusa","nusacuma1@gmail.com","3"));
        postArrayList.add(new Post("Jamaika","jamaikanya@gmail.com","4"));
        postArrayList.add(new Post("Kresna","kresnatinggiwibawa@gmail.com","5"));
        postArrayList.add(new Post("Janur","janurmelengkung@gmail.com","6"));
        postArrayList.add(new Post("Hayati","hayatimuhancur@gmail.com","7"));
        postArrayList.add(new Post("Alif","alifnasari@gmail.com","8"));
        postArrayList.add(new Post("Ali","aliakbar@gmail.com","9"));
        postArrayList.add(new Post("Nafsir","riannafsir@gmail.com","10"));
        postArrayList.add(new Post("Juna","junjunjuna@gmail.com","11"));
        postArrayList.add(new Post("Huga","hugadikamadalika@gmail.com","12"));
    }
}