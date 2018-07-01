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

public class FoodPlacesFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.food_place_name_1),
                getString(R.string.food_place_address_1),
                getString(R.string.food_place_description_1),
                getString(R.string.food_place_website_1),
                getString(R.string.food_place_phone_1),
                R.drawable.food_place_portos_bakery_and_cafe));
        places.add(new Place(getString(R.string.food_place_name_2),
                getString(R.string.food_place_address_2),
                getString(R.string.food_place_description_2),
                getString(R.string.food_place_website_2),
                getString(R.string.food_place_phone_2),
                R.drawable.food_place_pour_vida));
        places.add(new Place(getString(R.string.food_place_name_3),
                getString(R.string.food_place_address_3),
                getString(R.string.food_place_description_3),
                getString(R.string.food_place_website_3),
                getString(R.string.food_place_phone_3),
                R.drawable.food_place_garlic_and_chives));
        places.add(new Place(getString(R.string.food_place_name_4),
                getString(R.string.food_place_address_4),
                getString(R.string.food_place_description_4),
                getString(R.string.food_place_website_4),
                getString(R.string.food_place_phone_4),
                R.drawable.food_place_burritos_la_palma_santa_ana));
        places.add(new Place(getString(R.string.food_place_name_5),
                getString(R.string.food_place_address_5),
                getString(R.string.food_place_description_5),
                getString(R.string.food_place_website_5),
                getString(R.string.food_place_phone_5),
                R.drawable.food_place_taco_maria));
        places.add(new Place(getString(R.string.food_place_name_6),
                getString(R.string.food_place_address_6),
                getString(R.string.food_place_description_6),
                getString(R.string.food_place_website_6),
                getString(R.string.food_place_phone_6),
                R.drawable.food_place_vaca));
        places.add(new Place(getString(R.string.food_place_name_7),
                getString(R.string.food_place_address_7),
                getString(R.string.food_place_description_7),
                getString(R.string.food_place_website_7),
                getString(R.string.food_place_phone_7),
                R.drawable.food_place_mesa));
        places.add(new Place(getString(R.string.food_place_name_8),
                getString(R.string.food_place_address_8),
                getString(R.string.food_place_description_8),
                getString(R.string.food_place_website_8),
                getString(R.string.food_place_phone_8),
                R.drawable.food_place_blackmarket_bakery));
        places.add(new Place(getString(R.string.food_place_name_9),
                getString(R.string.food_place_address_9),
                getString(R.string.food_place_description_9),
                getString(R.string.food_place_website_9),
                getString(R.string.food_place_phone_9),
                R.drawable.food_place_oo_toro_sushi));
        places.add(new Place(getString(R.string.food_place_name_10),
                getString(R.string.food_place_address_10),
                getString(R.string.food_place_description_10),
                getString(R.string.food_place_website_10),
                getString(R.string.food_place_phone_10),
                R.drawable.food_place_bluegold_and_lsxo));

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
