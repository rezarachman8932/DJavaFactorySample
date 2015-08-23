package com.first.djfactory;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.first.djfactory.rest.service.SessionRequestInterceptor;

import retrofit.RestAdapter;

/**
 * Created by user on 23/8/2015.
 */
public class DJavaApplication extends Application {

    private static DJavaApplication mInstance;
    private RestAdapter.Builder builder;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized DJavaApplication getInstance() {
        return mInstance;
    }

    public RestAdapter.Builder getAdapterBuilder() {
        if (builder == null) {
            builder = new RestAdapter.Builder()
                    .setEndpoint(Constant.BASE_URL)
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setRequestInterceptor(new SessionRequestInterceptor());

        }
        return builder;
    }

    public boolean isConnectingToInternet() {
        ConnectivityManager connectivity = (ConnectivityManager)
                getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (NetworkInfo anInfo : info)
                    if (anInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
        }
        return false;
    }

}
