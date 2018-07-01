package com.example.android.orangecountytourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class WildlifeAreasFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.wildlife_area_name_1),
                getString(R.string.wildlife_area_address_1),
                getString(R.string.wildlife_area_description_1),
                getString(R.string.wildlife_area_website_1),
                getString(R.string.wildlife_area_phone_1),
                R.drawable.wildlife_area_sherman_library_and_gardens));
        places.add(new Place(getString(R.string.wildlife_area_name_2),
                getString(R.string.wildlife_area_address_2),
                getString(R.string.wildlife_area_description_2),
                getString(R.string.wildlife_area_website_2),
                getString(R.string.wildlife_area_phone_2),
                R.drawable.wildlife_area_san_joaquin_wildlife_santuary));
        places.add(new Place(getString(R.string.wildlife_area_name_3),
                getString(R.string.wildlife_area_address_3),
                getString(R.string.wildlife_area_description_3),
                getString(R.string.wildlife_area_website_3),
                getString(R.string.wildlife_area_phone_3),
                R.drawable.wildlife_area_whiting_ranch_wilderness_park));
        places.add(new Place(getString(R.string.wildlife_area_name_4),
                getString(R.string.wildlife_area_address_4),
                getString(R.string.wildlife_area_description_4),
                getString(R.string.wildlife_area_website_4),
                getString(R.string.wildlife_area_phone_4),
                R.drawable.wildlife_area_rancho_las_lomas_wildlife_foundation));
        places.add(new Place(getString(R.string.wildlife_area_name_5),
                getString(R.string.wildlife_area_address_5),
                getString(R.string.wildlife_area_description_5),
                getString(R.string.wildlife_area_website_5),
                getString(R.string.wildlife_area_phone_5),
                R.drawable.beach_bolsa_chica_state_beach));
        places.add(new Place(getString(R.string.wildlife_area_name_6),
                getString(R.string.wildlife_area_address_6),
                getString(R.string.wildlife_area_description_6),
                getString(R.string.wildlife_area_website_6),
                getString(R.string.wildlife_area_phone_6),
                R.drawable.wildlife_area_thomas_f_riley_wilderness_park));
        places.add(new Place(getString(R.string.wildlife_area_name_7),
                getString(R.string.wildlife_area_address_7),
                getString(R.string.wildlife_area_description_7),
                getString(R.string.wildlife_area_website_7),
                getString(R.string.wildlife_area_phone_7),
                R.drawable.wildlife_area_seal_beach_national_wildlife_refuge));
        places.add(new Place(getString(R.string.wildlife_area_name_8),
                getString(R.string.wildlife_area_address_8),
                getString(R.string.wildlife_area_description_8),
                getString(R.string.wildlife_area_website_8),
                getString(R.string.wildlife_area_phone_8),
                R.drawable.wildlife_area_pacific_marine_mammal_center));
        places.add(new Place(getString(R.string.wildlife_area_name_9),
                getString(R.string.wildlife_area_address_9),
                getString(R.string.wildlife_area_description_9),
                getString(R.string.wildlife_area_website_9),
                getString(R.string.wildlife_area_phone_9),
                R.drawable.wildlife_area_peters_canyon_regional_park));
        places.add(new Place(getString(R.string.wildlife_area_name_10),
                getString(R.string.wildlife_area_address_10),
                getString(R.string.wildlife_area_description_10),
                getString(R.string.wildlife_area_website_10),
                getString(R.string.wildlife_area_phone_10),
                R.drawable.wildlife_area_upper_newport_bay_nature_preserve));

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
