package com.example.borstel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelProduk {

    @SerializedName("produk_id")
    @Expose
    private String produkId;
    @SerializedName("produk_nama")
    @Expose
    private String produkNama;
    @SerializedName("produk_desc")
    @Expose
    private String produkDesc;
    @SerializedName("produk_gambar")
    @Expose
    private String produkGambar;
    @SerializedName("produk_harga")
    @Expose
    private String produkHarga;

    public String getProdukId() {
        return produkId;
    }

    public void setProdukId(String produkId) {
        this.produkId = produkId;
    }

    public String getProdukNama() {
        return produkNama;
    }

    public void setProdukNama(String produkNama) {
        this.produkNama = produkNama;
    }

    public String getProdukDesc() {
        return produkDesc;
    }

    public void setProdukDesc(String produkDesc) {
        this.produkDesc = produkDesc;
    }

    public String getProdukGambar() {
        return produkGambar;
    }

    public void setProdukGambar(String produkGambar) {
        this.produkGambar = produkGambar;
    }

    public String getProdukHarga() {
        return produkHarga;
    }

    public void setProdukHarga(String produkHarga) {
        this.produkHarga = produkHarga;
    }

}