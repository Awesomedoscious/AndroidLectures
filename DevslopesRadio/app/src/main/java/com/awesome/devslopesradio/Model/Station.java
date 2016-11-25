package com.awesome.devslopesradio.Model;

/**
 * Created by Miguel on 11/17/2016.
 */

public class Station {

    final String DRAWABLE = "drawable/";

    private String stationTitle;
    private String imgUri;

    public Station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri = imgUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }

}
