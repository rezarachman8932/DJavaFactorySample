package com.first.djfactory.rest.api;

import com.first.djfactory.rest.model.ServerResponse;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by user on 12/8/2015.
 */
public interface ApiService {

    String HEADLINE = "/headlinelist";

    @GET(HEADLINE)
    void getHeadline(Callback<ServerResponse> headlineCallback);

}
