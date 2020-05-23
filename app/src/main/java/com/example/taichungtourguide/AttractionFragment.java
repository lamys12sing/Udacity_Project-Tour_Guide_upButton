package com.example.taichungtourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.display_item_list, container, false);

        //Create an ArrayList for tourist attraction
        ArrayList<ItemPlaced> attraction = new ArrayList<>();
        attraction.add(new ItemPlaced("樂樂樹屋", R.drawable.attraction_1));
        attraction.add(new ItemPlaced("米奇樹", R.drawable.attraction_2));
        attraction.add(new ItemPlaced("大理藝術區", R.drawable.attraction_3));
        attraction.add(new ItemPlaced("星願紫風車", R.drawable.attraction_4));
        attraction.add(new ItemPlaced("彩虹眷村", R.drawable.attraction_5));
        attraction.add(new ItemPlaced("草悟道", R.drawable.attraction_6));
        attraction.add(new ItemPlaced("新社古堡", R.drawable.attraction_7));
        attraction.add(new ItemPlaced("高美濕地", R.drawable.attraction_8));
        attraction.add(new ItemPlaced("秋紅谷", R.drawable.attraction_9));
        attraction.add(new ItemPlaced("心之芳庭", R.drawable.attraction_10));

        //Get the ListView from xml
        ListView displayList = (ListView) v.findViewById(R.id.displayList);

        //Set adapter for {@link displayList}
        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), attraction);
        displayList.setAdapter(adapter);

        return v;
    }
}
