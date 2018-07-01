package com.example.android.orangecountytourguide;

public class Place {
    private String mPlaceName;
    private String mPlaceAddress;
    private String mPlaceDescription;
    private String mPlaceWebsite;
    private String mPlacePhone;
    private int mPlaceImage;

    public Place(String placeName, String placeAddress, String placeDescription,
                 String placeWebsite, String placePhone, int placeImage){
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceDescription = placeDescription;
        mPlaceWebsite = placeWebsite;
        mPlacePhone = placePhone;
        mPlaceImage = placeImage;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public String getPlaceWebsite() {
        return mPlaceWebsite;
    }

    public String getPlacePhone() {
        return mPlacePhone;
    }

    public int getPlaceImage() {
        return mPlaceImage;
    }
}
