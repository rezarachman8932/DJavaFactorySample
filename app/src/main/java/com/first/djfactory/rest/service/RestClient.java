package com.first.djfactory.rest.service;

import com.first.djfactory.Constant;
import com.first.djfactory.DJavaApplication;
import com.first.djfactory.rest.api.ApiService;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;

import java.io.File;

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
        // Cache
        File httpCacheDirectory = new File(DJavaApplication.getInstance()
                .getCacheDir().getAbsolutePath(), "Response");
        Cache cache = new Cache(httpCacheDirectory, Constant.cacheSize);
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setCache(cache);
        // Adapter
        RestAdapter restAdapter = DJavaApplication.getInstance().getAdapterBuilder().build();
        apiService = restAdapter.create(ApiService.class);
    }

    public static ApiService getService() {
        return apiService;
    }

}
