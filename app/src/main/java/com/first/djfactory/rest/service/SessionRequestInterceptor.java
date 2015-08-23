package com.first.djfactory.rest.service;

import com.first.djfactory.Constant;
import com.first.djfactory.DJavaApplication;

import retrofit.RequestInterceptor;

/**
 * Created by user on 23/8/2015.
 */
public class SessionRequestInterceptor implements RequestInterceptor {
    @Override
    public void intercept(RequestFacade request) {
        request.addHeader("Accept", "application/json;versions=1");
        if (DJavaApplication.getInstance().isConnectingToInternet()) {
            // Read from cache for 1 minute
            request.addHeader("Cache-Control", "public, max-age=" + Constant.maxAge);
        } else {
            // Tolerate 4 weeks stale
            request.addHeader("Cache-Control", "public, only-if-cached, max-stale=" + Constant.maxStale);
        }
    }
}
