package com.first.djfactory.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 15/8/2015.
 */
public class Headline {

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getKanal() {
        return kanal;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDatePublish() {
        return datePublish;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public String getUrl() {
        return url;
    }

    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    @SerializedName("date_publish")
    @Expose
    private String datePublish;

    @Expose
    private Integer timestamp;

    @Expose
    private String url;

    @Expose
    private String id;

    @Expose
    private String title;

    @Expose
    private String kanal;

}
