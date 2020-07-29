package com.example.borstel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("ApiYusuf")
    Call<GetJasaProduk> getProduk();
    @GET("ApiYusuf")
    Call<GetJasaProduk> getJasa();

//    @FormUrlEncoded
//    @POST("kontak")
//    Call<PostPutDelWisata> postKontak(@Field("nama") String nama,
//                                      @Field("nomor") String nomor);
//    @FormUrlEncoded
//    @PUT("kontak")
//    Call<PostPutDelWisata> putKontak(@Field("id") String id,
//                                     @Field("nama") String nama,
//                                     @Field("nomor") String nomor);
//    @FormUrlEncoded
//    @HTTP(method = "DELETE", path = "kontak", hasBody = true)
//    Call<PostPutDelWisata> deleteKontak(@Field("id") String id);
}
