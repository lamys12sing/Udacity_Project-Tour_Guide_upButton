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

public class HotelFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.display_item_list, container, false);

        //Create an ArrayList for hotel
        ArrayList<ItemPlaced> hotel = new ArrayList<>();
        hotel.add(new ItemPlaced("紅點文旅", "400台中市中區民族路206號", R.drawable.hotel_1));
        hotel.add(new ItemPlaced("臺中公園智選假日飯店", "400台中市中區自由路2段94號", R.drawable.hotel_2));
        hotel.add(new ItemPlaced("1969藍天飯店", "40045台中市中區市府路38號", R.drawable.hotel_3));
        hotel.add(new ItemPlaced("台中富信大飯店", "400台中市中區市府路14號", R.drawable.hotel_4));
        hotel.add(new ItemPlaced("歐非行旅", "40358台中市西區忠明南路333號", R.drawable.hotel_5));
        hotel.add(new ItemPlaced("璞樹文旅", "台中市西屯區黎明路三段235號", R.drawable.hotel_6));
        hotel.add(new ItemPlaced("台中麗加園邸", "40350台中市西區公益路111號", R.drawable.hotel_7));
        hotel.add(new ItemPlaced("MINI HOTELS - 逢甲館", "407台中市西屯區福星北一街15號", R.drawable.hotel_8));
        hotel.add(new ItemPlaced("逢甲納尼亞", "台中西屯區文華路117號", R.drawable.hotel_9));
        hotel.add(new ItemPlaced("星月文旅", "台中市后里區月眉北路486號", R.drawable.hotel_10));


        //Get the ListView from xml
        ListView displayList = (ListView) v.findViewById(R.id.displayList);

        //Set adapter for {@link displayList}
        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), hotel);
        displayList.setAdapter(adapter);

        return v;
    }
}
