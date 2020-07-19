package com.example.borstel;

public class Produk {
    private String Title;
    private int Thumbnail;
    private String Description;
    private String Harga;

    public Produk() {
    }

    public Produk(String title, int thumbnail, String description, String harga) {
        Title = title;
        Thumbnail = thumbnail;
        Description = description;
        Harga = harga;
    }

    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public String getDescription() {
        return Description;
    }

    public String getHarga() {
        return Harga;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }
}



