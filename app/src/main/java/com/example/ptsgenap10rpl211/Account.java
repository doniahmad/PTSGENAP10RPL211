package com.example.ptsgenap10rpl211;

public class Account {
    private String nama;
    private String id;
    private String email;

    public Account(String nama, String id, String email) {
        this.nama = nama;
        this.id = id;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
