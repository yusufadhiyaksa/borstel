package com.example.borstel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelJasa {

    @SerializedName("jasa_nama")
    @Expose
    private String jasaNama;
    @SerializedName("jasa_id")
    @Expose
    private String jasaId;
    @SerializedName("jasa_desc")
    @Expose
    private String jasaDesc;
    @SerializedName("jasa_durasi")
    @Expose
    private String jasaDurasi;
    @SerializedName("jasa_harga")
    @Expose
    private String jasaHarga;

    public String getJasaNama() {
        return jasaNama;
    }

    public void setJasaNama(String jasaNama) {
        this.jasaNama = jasaNama;
    }

    public String getJasaId() {
        return jasaId;
    }

    public void setJasaId(String jasaId) {
        this.jasaId = jasaId;
    }

    public String getJasaDesc() {
        return jasaDesc;
    }

    public void setJasaDesc(String jasaDesc) {
        this.jasaDesc = jasaDesc;
    }

    public String getJasaDurasi() {
        return jasaDurasi;
    }

    public void setJasaDurasi(String jasaDurasi) {
        this.jasaDurasi = jasaDurasi;
    }

    public String getJasaHarga() {
        return jasaHarga;
    }

    public void setJasaHarga(String jasaHarga) {
        this.jasaHarga = jasaHarga;
    }

}