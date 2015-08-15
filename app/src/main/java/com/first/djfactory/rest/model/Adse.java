package com.first.djfactory.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 15/8/2015.
 */
public class Adse {

    @Expose
    private String name;

    @Expose
    private Integer position;

    @Expose
    private Integer type;

    @SerializedName("unit_id")
    @Expose
    private String unitId;

    public Integer getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public Integer getType() {
        return type;
    }

    public String getUnitId() {
        return unitId;
    }

}
