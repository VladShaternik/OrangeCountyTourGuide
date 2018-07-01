package com.example.android.orangecountytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class BeachesFragment extends Fragment {

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.beach_name_1),
                getString(R.string.beach_address_1),
                getString(R.string.beach_description_1),
                getString(R.string.beach_website_1),
                getString(R.string.beach_phone_1),
                R.drawable.beach_crystal_cove_state_park));
        places.add(new Place(getString(R.string.beach_name_2),
                getString(R.string.beach_address_2),
                getString(R.string.beach_description_2),
                getString(R.string.beach_website_2),
                getString(R.string.beach_phone_2),
                R.drawable.beach_newport_beach));
        places.add(new Place(getString(R.string.beach_name_3),
                getString(R.string.beach_address_3),
                getString(R.string.beach_description_3),
                getString(R.string.beach_website_3),
                getString(R.string.beach_phone_3),
                R.drawable.beach_victoria));
        places.add(new Place(getString(R.string.beach_name_4),
                getString(R.string.beach_address_4),
                getString(R.string.beach_description_4),
                getString(R.string.beach_website_4),
                getString(R.string.beach_phone_4),
                R.drawable.beach_baby_beach));
        places.add(new Place(getString(R.string.beach_name_5),
                getString(R.string.beach_address_5),
                getString(R.string.beach_description_5),
                getString(R.string.beach_website_5),
                getString(R.string.beach_phone_5),
                R.drawable.beach_bolsa_chica_state_beach));
        places.add(new Place(getString(R.string.beach_name_6),
                getString(R.string.beach_address_6),
                getString(R.string.beach_description_6),
                getString(R.string.beach_website_6),
                getString(R.string.beach_phone_6),
                R.drawable.beach_huntington_dog_beach));
        places.add(new Place(getString(R.string.beach_name_7),
                getString(R.string.beach_address_7),
                getString(R.string.beach_description_7),
                getString(R.string.beach_website_7),
                getString(R.string.beach_phone_7),
                R.drawable.beach_salt_creek_beach));
        places.add(new Place(getString(R.string.beach_name_8),
                getString(R.string.beach_address_8),
                getString(R.string.beach_description_8),
                getString(R.string.beach_website_8),
                getString(R.string.beach_phone_8),
                R.drawable.beach_1000_steps));
        places.add(new Place(getString(R.string.beach_name_9),
                getString(R.string.beach_address_9),
                getString(R.string.beach_description_9),
                getString(R.string.beach_website_9),
                getString(R.string.beach_phone_9),
                R.drawable.beach_seal_beach));
        places.add(new Place(getString(R.string.beach_name_10),
                getString(R.string.beach_address_10),
                getString(R.string.beach_description_10),
                getString(R.string.beach_website_10),
                getString(R.string.beach_phone_10),
                R.drawable.beach_corona_del_mar_state));

        PlaceListAdapter placeListAdapter = new PlaceListAdapter(getActivity(), places);

        final GridView placeGrid = rootView.findViewById(R.id.items_grid);

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
