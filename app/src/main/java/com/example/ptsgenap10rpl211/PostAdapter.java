package com.example.ptsgenap10rpl211;

import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import javax.security.auth.callback.Callback;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHodler> {
    private Callback callback;

    private ArrayList<Post> Datalist;

    interface Callback {
        void onClick(int position);
    }

    public PostAdapter(ArrayList<Post> Datalist, Callback callback) {
        this.callback = callback;
        this.Datalist = Datalist;
    }

    @NonNull
    @Override
    public PostViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater LayoutInflanter = LayoutInflater.from(parent.getContext());
        View view = LayoutInflanter.inflate(R.layout.itemview, parent, false);
        return new PostViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHodler holder, int position) {
        holder.nama.setText(Datalist.get(position).getNama());
        holder.email.setText(Datalist.get(position).getEmail());
        holder.absen.setText(Datalist.get(position).getAbsen());
    }

    @Override
    public int getItemCount() {
        return (Datalist != null) ? Datalist.size() : 0;
    }


    public class PostViewHodler extends RecyclerView.ViewHolder {
        TextView nama, email, absen;
        CardView cardku;

        public PostViewHodler(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.txtNama);
            email = itemView.findViewById(R.id.txtEmail);
            absen = itemView.findViewById(R.id.txtAbsen);
            cardku = itemView.findViewById(R.id.cardku);
            cardku.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.onClick(getAdapterPosition());
                }
            });
        }
    }
}