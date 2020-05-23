package com.example.taichungtourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private final static int NUMBER_OF_FRAGMENT = 4;

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0){
            return new AttractionFragment();
        }
        else if (position == 1){
            return new HotelFragment();
        }
        else if (position == 2){
            return new RestaurantFragment();
        }
        else {
            return new FoodFragment();
        }
    }

    @Override
    public int getItemCount() {
        return NUMBER_OF_FRAGMENT;
    }
}
