package com.example.borstel;


public class Jasa{
    private String Title_Jasa;
    private int Thumbnail_Jasa;
    private String Description_Jasa;
    private String Harga_Jasa;

    public Jasa() {
    }

    public Jasa(String title_Jasa, int thumbnail_Jasa, String description_Jasa, String harga_Jasa) {
        Title_Jasa = title_Jasa;
        Thumbnail_Jasa = thumbnail_Jasa;
        Description_Jasa = description_Jasa;
        Harga_Jasa = harga_Jasa;
    }

    public String getTitle_Jasa() {
        return Title_Jasa;
    }

    public int getThumbnail_Jasa() {
        return Thumbnail_Jasa;
    }

    public String getDescription_Jasa() {
        return Description_Jasa;
    }

    public String getHarga_Jasa() {
        return Harga_Jasa;
    }

    public void setTitle_Jasa(String title_Jasa) {
        Title_Jasa = title_Jasa;
    }

    public void setThumbnail_Jasa(int thumbnail_Jasa) {
        Thumbnail_Jasa = thumbnail_Jasa;
    }

    public void setDescription_Jasa(String description_Jasa) {
        Description_Jasa = description_Jasa;
    }

    public void setHarga_Jasa(String harga_Jasa) {
        Harga_Jasa = harga_Jasa;
    }
}
