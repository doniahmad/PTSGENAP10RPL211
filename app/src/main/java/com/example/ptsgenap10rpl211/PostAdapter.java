package com.example.ptsgenap10rpl211;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHodler>{

    private ArrayList<Post> Datalist;

    public PostAdapter(ArrayList<Post> Datalist) {
        this.Datalist = Datalist;
    }

    @NonNull
    @Override
    public PostViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater LayoutInflanter = LayoutInflater.from(parent.getContext());
        View view = LayoutInflanter.inflate(R.layout.itemview,parent,false);
        return new PostViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHodler holder, int position) {
        holder.judul.setText(Datalist.get(position).getJudul());
        holder.total.setText(Datalist.get(position).getTotal()+"");
    }

    @Override
    public int getItemCount() {
        return (Datalist != null) ? Datalist.size() : 0;
    }


    public class PostViewHodler extends RecyclerView.ViewHolder {
        TextView judul,total;
        public PostViewHodler(View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.txtJudul);
            total = itemView.findViewById(R.id.txtTotal);
        }
    }
}