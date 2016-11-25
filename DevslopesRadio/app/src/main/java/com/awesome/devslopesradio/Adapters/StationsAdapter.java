package com.awesome.devslopesradio.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.awesome.devslopesradio.Activities.MainActivity;
import com.awesome.devslopesradio.Holders.StationViewHolder;
import com.awesome.devslopesradio.Model.Station;
import com.awesome.devslopesradio.R;

import java.util.ArrayList;

/**
 * Created by Miguel on 11/17/2016.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder>{

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, final int position) {
        final Station station = stations.get(position);
        holder.updateUI(station);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Load the Details screen.
                MainActivity.getMainActivity().loadDetailsScreen(station);
            }
        });

    }

    @Override
    public int getItemCount() {
        return stations.size();
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }

}
