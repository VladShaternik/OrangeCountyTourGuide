package com.example.android.orangecountytourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceListAdapter extends ArrayAdapter<Place> {

    public PlaceListAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_place_list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        ImageView placeImage = listItemView.findViewById(R.id.single_place_item_image);
        placeImage.setImageResource(currentPlace.getPlaceImage());

        TextView placeTitle = listItemView.findViewById(R.id.single_place_item_title);
        placeTitle.setText(currentPlace.getPlaceName());

        TextView placeAddress = listItemView.findViewById(R.id.single_place_item_address);
        placeAddress.setText(currentPlace.getPlaceAddress());

        return listItemView;
    }
}
