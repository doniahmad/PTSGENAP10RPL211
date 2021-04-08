package com.example.ptsgenap10rpl211;

public class Post {
    private String judul;
    private int total;

    public Post (String judul,int total){
        this.setJudul(judul);
        this.setTotal(total);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
