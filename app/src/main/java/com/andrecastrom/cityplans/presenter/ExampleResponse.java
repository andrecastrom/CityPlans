package com.andrecastrom.cityplans.presenter;

import com.andrecastrom.cityplans.model.EventResponse;
import com.andrecastrom.cityplans.model.pojo.Event;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

import java.util.ArrayList;

/**
 * Created by Andre on 17/12/2016.
 */

public class ExampleResponse {

    public EventResponse body() {

        //Lat 40.410889 / 40.415889
        //Lon -3.707398 / -3.757398
        String lat1 = "40.41";
        String lat2 = "889";
        String lon1 = "-3.7";
        String lon2 = "7398";

        ArrayList<Event> events = new ArrayList<Event>();

        for (int i=0; i<5; i++) {

            Event event = new Event();
            event.setId(String.valueOf(i));
            event.setName("Evento " +i);

            event.setLatitude(Float.valueOf(lat1 + i + lat2));
            event.setLongitude(Float.valueOf(lon1 + i + lon2));

            switch (i) {
                case 0:
                    event.setColor(BitmapDescriptorFactory.HUE_AZURE);
                    break;
                case 1:
                    event.setColor(BitmapDescriptorFactory.HUE_GREEN);
                    break;
                case 2:
                    event.setColor(BitmapDescriptorFactory.HUE_RED);
                    break;
                case 3:
                    event.setColor(BitmapDescriptorFactory.HUE_ORANGE);
                    break;
                case 4:
                    event.setColor(BitmapDescriptorFactory.HUE_YELLOW);
                    break;
            }

            events.add(event);
        }

        EventResponse eventResponse = new EventResponse();
        eventResponse.setListEvents(events);
        return eventResponse;

    }

}
