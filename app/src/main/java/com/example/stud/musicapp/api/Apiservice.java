package com.example.stud.musicapp.api;


import retrofit2.Retrofit;

public class Apiservice {
    public static ApiClient getService() {
        Retrofit retrofit = new Retrofit.Builder()
               .baseUrl( "http://www.theaudiodb.com/api/v1/json/{APIKEY}/" )
                .build();
        return retrofit.create(ApiClient. class );
    }
}
