package com.example.android.orangecountytourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Beaches", "Food Places", "Theme Parks", "Wildlife Areas"};

    SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BeachesFragment();
            case 1:
                return new FoodPlacesFragment();
            case 2:
                return new ThemeParksFragment();
            case 3:
                return new WildlifeAreasFragment();
            default:
                return new BeachesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
