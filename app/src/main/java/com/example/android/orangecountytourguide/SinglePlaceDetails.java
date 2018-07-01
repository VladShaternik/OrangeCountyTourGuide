package com.example.android.orangecountytourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SinglePlaceDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_place_details);

        ImageView detailsImage = findViewById(R.id.details_photo);
        detailsImage.setImageResource(getIntent().getExtras().getInt("place_image"));

        TextView detailsTitle = findViewById(R.id.details_title);
        detailsTitle.setText(getIntent().getExtras().getString("place_name"));

        TextView detailsAddress = findViewById(R.id.details_address);
        detailsAddress.setText(getIntent().getExtras().getString("place_address"));

        TextView detailsDescription = findViewById(R.id.details_description);
        detailsDescription.setText(getIntent().getExtras().getString("place_description"));

        TextView detailsWebsite = findViewById(R.id.details_website);
        detailsWebsite.setText(getIntent().getExtras().getString("place_website"));

        TextView detailsPhone = findViewById(R.id.details_phone);
        detailsPhone.setText(getIntent().getExtras().getString("place_phone"));
    }
}