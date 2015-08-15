package com.first.djfactory.rest.model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15/8/2015.
 */
public class ServerResponse {

    public List<Response> getResponse() {
        return response;
    }

    @Expose
    private List<Response> response = new ArrayList<>();

}
