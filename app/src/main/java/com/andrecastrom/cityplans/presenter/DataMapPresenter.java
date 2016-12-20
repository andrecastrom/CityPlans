package com.andrecastrom.cityplans.presenter;

import android.content.Context;

import com.andrecastrom.cityplans.model.EventResponse;
import com.andrecastrom.cityplans.model.pojo.Event;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

/**
 * Created by 47369176d on 16/12/2016.
 */

public class DataMapPresenter implements IDataMapPresenter {

    private Context context;
    private SupportMapFragment mapFragment;
    private GoogleMap mMap;
    private ArrayList<Event> listEvents;

    public void DataMapPresenter (SupportMapFragment mapFragment, GoogleMap mMap, Context context) {
        this.mapFragment = mapFragment;
        this.mMap = mMap;
        this.context = context;
    }

    public void setMap(GoogleMap mMap) {
        this.mMap = mMap;
    }


    public void getDataMap () {
        EventResponse eventResponse = (new ExampleResponse()).body();
        listEvents = eventResponse.getListEvents();
        showDataMap();
    }


    public void showDataMap () {
        for (Event event: listEvents) {
            LatLng eventPosition = new LatLng(event.getLatitude(), event.getLongitude());
            MarkerOptions marker = new MarkerOptions();
            marker.title(event.getName());
            marker.position(eventPosition);
            marker.icon(BitmapDescriptorFactory.defaultMarker(event.getColor()));
            mMap.addMarker(marker);
}   }

    public float converteColorMarker(String color) {
        return 0;
    }

}
