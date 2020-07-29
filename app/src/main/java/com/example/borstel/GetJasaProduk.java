package com.example.borstel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetJasaProduk {

    @SerializedName("jasa")
    @Expose
    private List<ModelJasa> jasa = null;
    @SerializedName("produk")
    @Expose
    private List<ModelProduk> produk = null;
    @SerializedName("status")
    @Expose
    private String status;

    public List<ModelJasa> getJasa() {
        return jasa;
    }

    public void setJasa(List<ModelJasa> jasa) {
        this.jasa = jasa;
    }

    public List<ModelProduk> getProduk() {
        return produk;
    }

    public void setProduk(List<ModelProduk> produk) {
        this.produk = produk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}