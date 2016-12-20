package com.andrecastrom.cityplans.model;

import com.andrecastrom.cityplans.model.pojo.Event;

import java.util.ArrayList;

/**
 * Created by Andre on 17/12/2016.
 */

public class EventResponse {

    private ArrayList<Event> listEvents;

    public ArrayList<Event> getListEvents() {
        return listEvents;
    }

    public void setListEvents(ArrayList<Event> listEvents) {
        this.listEvents = listEvents;
    }
}
