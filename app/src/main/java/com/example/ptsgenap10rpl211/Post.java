package com.example.ptsgenap10rpl211;

public class Post {
    private String nama;
    private String email;
    private String absen;

    public Post (String nama,String email,String absen){
        this.nama = nama;
        this.email = email;
        this.absen = absen;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbsen() {
        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }
}
