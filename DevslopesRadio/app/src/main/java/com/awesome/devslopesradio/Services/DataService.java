package com.awesome.devslopesradio.Services;

import com.awesome.devslopesradio.Model.Station;

import java.util.ArrayList;

/**
 * Created by Miguel on 11/17/2016.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations() {
        //Pretend we just downloaded featured stations from the Internet.

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kid's Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Vinyl Music (Classy Tunes)", "vinylmusic"));
        list.add(new Station("Sharing Music (Enjoying Music with Friends)", "socialmusic"));
        list.add(new Station("Must Listen (Famous Songs)", "keymusic"));

        return list;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Dirty Dan (Here's the plan)", "vinylmusic"));
        list.add(new Station("Free Fallin' (Skydiving)", "flightplanmusic"));
        list.add(new Station("Blam Blam (The Flinstones)", "kidsmusic"));

        return list;
    }
}
