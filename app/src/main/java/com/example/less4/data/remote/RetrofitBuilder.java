package com.example.less4.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static GhibiiApo instance;

    public RetrofitBuilder() {}

    public static GhibiiApo getInstance() {
        if (instance == null) {
            instance = createRetrofit();
        }
        return instance;
    }

    private static GhibiiApo createRetrofit() {
        return new Retrofit
                .Builder()
                .baseUrl("https://www.cinematica.kg/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GhibiiApo.class);
    }
}
