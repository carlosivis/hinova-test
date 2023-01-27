package com.example.data;

import com.example.data.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {
    public WebServiceInterface WebService() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(WebServiceInterface.class);
    }
}
