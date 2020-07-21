package com.example.borstel;


public class Jasa {
    private String Title_Jasa;
    private String Description_Jasa;
    private String Harga_Jasa;
    private String Durasi_Jasa;

    public Jasa() {
    }

    public Jasa(String title_Jasa, String description_Jasa, String harga_Jasa, String durasi_Jasa) {
        Title_Jasa = title_Jasa;
        Description_Jasa = description_Jasa;
        Harga_Jasa = harga_Jasa;
        Durasi_Jasa = durasi_Jasa;
    }

    public String getTitle_Jasa() {
        return Title_Jasa;
    }

    public String getDescription_Jasa() {
        return Description_Jasa;
    }

    public String getHarga_Jasa() {
        return Harga_Jasa;
    }

    public String getDurasi_Jasa() {
        return Durasi_Jasa;
    }

    public void setTitle_Jasa(String title_Jasa) {
        Title_Jasa = title_Jasa;
    }

    public void setDescription_Jasa(String description_Jasa) {
        Description_Jasa = description_Jasa;
    }

    public void setHarga_Jasa(String harga_Jasa) {
        Harga_Jasa = harga_Jasa;
    }

    public void setDurasi_Jasa(String durasi_Jasa) {
        Durasi_Jasa = durasi_Jasa;
    }
}