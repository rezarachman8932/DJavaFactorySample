package com.first.djfactory.rest.service;

import com.first.djfactory.rest.api.ApiService;

import retrofit.RestAdapter;

/**
 * Created by user on 12/8/2015.
 */
public class RestClient {

    private static ApiService apiService;

    static {
        setupRestClient();
    }

    private static void setupRestClient() {
        String BASE_URL = "http://api.viva.co.id/v/210";
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL);
        RestAdapter restAdapter = builder.build();
        apiService = restAdapter.create(ApiService.class);
    }

    public static ApiService getService() {
        return apiService;
    }

}
