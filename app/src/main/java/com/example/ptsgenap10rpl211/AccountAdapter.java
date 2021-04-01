package com.example.ptsgenap10rpl211;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.AccountViewHolder>{

    private ArrayList<Account> dataList;
    public AccountAdapter(ArrayList<Account> dataList) {
        this.dataList = dataList;
    }

    @Override
    public AccountViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater LayoutInflater = android.view.LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.inflate(R.layout.itemview,parent,false);
        //untuk menghubungkan ke xml
        return new AccountViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AccountViewHolder holder, int position) {
        holder.Nama.setText(dataList.get(position).getNama());
        holder.Id.setText(dataList.get(position).getId());
        holder.Email.setText(dataList.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class AccountViewHolder extends RecyclerView.ViewHolder {
        private TextView Nama,Id,Email;

        public AccountViewHolder(View itemView) {
            super(itemView);
            Nama = itemView.findViewById(R.id.txtNama);
            Id = itemView.findViewById(R.id.txtId);
            Email = itemView.findViewById(R.id.txtEmail);
        }
    }
}
