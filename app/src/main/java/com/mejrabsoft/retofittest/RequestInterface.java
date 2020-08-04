package com.mejrabsoft.retofittest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface RequestInterface {

    @GET("cars_list.json")
    Call<List<CarsModel>> getCarsJson();
}
