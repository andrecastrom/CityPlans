package com.andrecastrom.cityplans;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends SupportMapFragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    private SupportMapFragment mapFragment;

    public MapsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_maps, container, false);
        mapFragment = (SupportMapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return v;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng madrid = new LatLng(40.415363, -3.707398);
        Float zoom = new Float(15);
        mMap.addMarker(new MarkerOptions().position(madrid).title("Marker in Madrid"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(madrid));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid, zoom));
    }


    public void onRefresh() {
        LatLng madrid = new LatLng(40.413889, -3.6925);
        Float zoom = new Float(15);
        mMap.addMarker(new MarkerOptions().position(madrid).title("Marker onRefresh"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(madrid));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid, zoom));
    }


}
