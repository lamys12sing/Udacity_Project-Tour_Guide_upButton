package com.example.taichungtourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStat) {
        View v = inflater.inflate(R.layout.display_item_list, container, false);

        //Create an ArrayList for restaurant
        ArrayList<ItemPlaced> restaurant = new ArrayList<>();
        restaurant.add(new ItemPlaced("貓門‧MOMENT", R.drawable.restaurant_1));
        restaurant.add(new ItemPlaced("堅果小巷", R.drawable.restaurant_2));
        restaurant.add(new ItemPlaced("美好年代", R.drawable.restaurant_3));
        restaurant.add(new ItemPlaced("萌木之村Momu", R.drawable.restaurant_4));
        restaurant.add(new ItemPlaced("蔦屋書店 TSUTAYA BOOKSTORE", R.drawable.restaurant_5));
        restaurant.add(new ItemPlaced("Molecure分子藥局", R.drawable.restaurant_6));
        restaurant.add(new ItemPlaced("星巴克大英店", R.drawable.restaurant_7));
        restaurant.add(new ItemPlaced("眺高啖藝", R.drawable.restaurant_8));
        restaurant.add(new ItemPlaced("kafeD 德勒斯登河岸咖啡", R.drawable.restaurant_9));
        restaurant.add(new ItemPlaced("琴森林主題餐廳", R.drawable.restaurant_10));


        //Get the ListView from xml
        ListView displayList = (ListView) v.findViewById(R.id.displayList);

        //Set adapter for {@link displayList}
        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), restaurant);
        displayList.setAdapter(adapter);

        return v;
    }
}
