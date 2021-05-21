package com.example.less4.data.remote;

import com.example.less4.data.model.FilmModel;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GhibiiApo {
    @GET("movies/{id}")
    Callback<FilmModel> getFilms(
            @Path("id") String filmId);

}
