package com.example.borstel;

public class Produk {
    private String Title;
    private String Thumbnail;
    private String Description;

    public Produk() {
    }

    public Produk(String title, String thumbnail, String description) {
        Title = title;
        Thumbnail = thumbnail;
        Description = description;
    }

    public String getTitle() {
        return Title;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public String getDescription() {
        return Description;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
