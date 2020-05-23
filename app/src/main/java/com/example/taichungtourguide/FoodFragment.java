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

public class FoodFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.display_item_list, container, false);

        //Create an ArrayList for food
        ArrayList<ItemPlaced> food = new ArrayList<>();
        food.add(new ItemPlaced("逢甲酥皮蛋餅", R.drawable.food_1));
        food.add(new ItemPlaced("迷霧碳烤土司", R.drawable.food_2));
        food.add(new ItemPlaced("台中肉員", R.drawable.food_3));
        food.add(new ItemPlaced("大麻粉圓冰", R.drawable.food_4));
        food.add(new ItemPlaced("小狗幫丹麥牛奶棒", R.drawable.food_5));
        food.add(new ItemPlaced("惡魔雞排", R.drawable.food_6));
        food.add(new ItemPlaced("金牌巨無霸臭豆腐", R.drawable.food_7));
        food.add(new ItemPlaced("統元豆花", R.drawable.food_8));
        food.add(new ItemPlaced("御品元冰火湯圓", R.drawable.food_9));
        food.add(new ItemPlaced("杏子豆腐冰", R.drawable.food_10));

        //Get the ListView from xml
        ListView displayList = (ListView) v.findViewById(R.id.displayList);

        //Set adapter for {@link displayList}
        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), food);
        displayList.setAdapter(adapter);
        return v;
    }
}
