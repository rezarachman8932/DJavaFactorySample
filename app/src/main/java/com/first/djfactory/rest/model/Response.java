package com.first.djfactory.rest.model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15/8/2015.
 */
public class Response {

    public List<Headline> getHeadlines() {
        return headlines;
    }

    public List<Adse> getAdses() {
        return adses;
    }

    @Expose
    private List<Headline> headlines = new ArrayList<>();
    @Expose
    private List<Adse> adses = new ArrayList<>();

}
