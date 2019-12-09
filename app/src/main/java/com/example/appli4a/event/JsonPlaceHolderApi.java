package com.example.appli4a.event;

import android.telecom.Call;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("beers")
    Call<List<Beer>> getListBeer();
}
