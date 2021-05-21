package com.example.less4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.less4.R;
import com.example.less4.data.remote.CallBackForRetrofit;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    private  CallBackForRetrofit callBackForRetrofit = new CallBackForRetrofit();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    callBackForRetrofit.getQuery("1116", filmModel -> {
        Log.d(TAG, "onCreate: " + filmModel.toString());
    });
    }
}