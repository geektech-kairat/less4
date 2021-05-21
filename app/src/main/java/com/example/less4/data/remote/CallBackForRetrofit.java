package com.example.less4.data.remote;

import android.util.Log;

import com.example.less4.data.model.FilmModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class CallBackForRetrofit {


    public void getQuery(String filmId, GetQuery<FilmModel> query) {
        RetrofitBuilder.getInstance().getFilms(filmId).equals(new Callback<FilmModel>() {
            @Override
            public void onResponse(Call<FilmModel> call, Response<FilmModel> response) {
                if (response.isSuccessful() && response.body() != null){
                    query.onSuccess(response.body());
                }
                else {
                    query.onFailure("Request error");
                }
            }

            @Override
            public void onFailure(Call<FilmModel> call, Throwable t) {
                query.onFailure(t.getLocalizedMessage());
            }
        });
    }

    public interface GetQuery<Model> {
        void onSuccess(Model model);

        default void onFailure(String errorMsg) {
            Log.e(TAG, "onFailure: " + errorMsg);
        }
    }
}
