package com.example.borstel;

public class Produk {
    private String Title;
    private int Thumbnail;
    private String Description;

    public Produk() {
    }


    public Produk(String title, int thumbnail, String description) {
        Title = title;
        Thumbnail = thumbnail;
        Description = description;
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

    public void setTitle(String title) {
        Title = title;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public void setDescription(String description) {
        Description = description;
    }

}


