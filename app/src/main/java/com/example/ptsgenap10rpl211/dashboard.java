package com.example.ptsgenap10rpl211;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;

public class dashboard extends AppCompatActivity {
    private MaterialToolbar btnback;
    private RecyclerView recyclerView;
    private PostAdapter adapter;
    private ArrayList<Post> postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);

        addData();
        adapter = new PostAdapter(postAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(dashboard.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        postAdapter = new ArrayList<>();
        postAdapter.add(new Post("Sari",0));
        postAdapter.add(new Post("Burhan",1));
        postAdapter.add(new Post("Nusa",3));
    }
}