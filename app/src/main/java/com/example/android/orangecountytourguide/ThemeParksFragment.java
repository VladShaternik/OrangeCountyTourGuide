package com.example.android.orangecountytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class ThemeParksFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.theme_park_name_1),
                getString(R.string.theme_park_address_1),
                getString(R.string.theme_park_description_1),
                getString(R.string.theme_park_website_1),
                getString(R.string.theme_park_phone_1),
                R.drawable.theme_park_disney_california_adventure_park));
        places.add(new Place(getString(R.string.theme_park_name_2),
                getString(R.string.theme_park_address_2),
                getString(R.string.theme_park_description_2),
                getString(R.string.theme_park_website_2),
                getString(R.string.theme_park_phone_2),
                R.drawable.theme_park_knotts_berry_farm));
        places.add(new Place(getString(R.string.theme_park_name_3),
                getString(R.string.theme_park_address_3),
                getString(R.string.theme_park_description_3),
                getString(R.string.theme_park_website_3),
                getString(R.string.theme_park_phone_3),
                R.drawable.theme_park_adventure_city));
        places.add(new Place(getString(R.string.theme_park_name_4),
                getString(R.string.theme_park_address_4),
                getString(R.string.theme_park_description_4),
                getString(R.string.theme_park_website_4),
                getString(R.string.theme_park_phone_4),
                R.drawable.theme_park_boomers_irvine));
        places.add(new Place(getString(R.string.theme_park_name_5),
                getString(R.string.theme_park_address_5),
                getString(R.string.theme_park_description_5),
                getString(R.string.theme_park_website_5),
                getString(R.string.theme_park_phone_5),
                R.drawable.theme_park_universal_studios_hollywood));
        places.add(new Place(getString(R.string.theme_park_name_6),
                getString(R.string.theme_park_address_6),
                getString(R.string.theme_park_description_6),
                getString(R.string.theme_park_website_6),
                getString(R.string.theme_park_phone_6),
                R.drawable.theme_park_great_wolf_lodge_southern_california));
        places.add(new Place(getString(R.string.theme_park_name_7),
                getString(R.string.theme_park_address_7),
                getString(R.string.theme_park_description_7),
                getString(R.string.theme_park_website_7),
                getString(R.string.theme_park_phone_7),
                R.drawable.theme_park_orange_county_great_park));

        PlaceListAdapter placeListAdapter = new PlaceListAdapter(getActivity(), places);

        GridView placeGrid = rootView.findViewById(R.id.items_grid);

        placeGrid.setAdapter(placeListAdapter);

        placeGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), SinglePlaceDetails.class);
                Place currentPlace = places.get(position);
                intent.putExtra("place_name", currentPlace.getPlaceName());
                intent.putExtra("place_address", currentPlace.getPlaceAddress());
                intent.putExtra("place_description", currentPlace.getPlaceDescription());
                intent.putExtra("place_website", currentPlace.getPlaceWebsite());
                intent.putExtra("place_phone", currentPlace.getPlacePhone());
                intent.putExtra("place_image", currentPlace.getPlaceImage());
                startActivity(intent);
            }
        });


        return rootView;
    }
}
