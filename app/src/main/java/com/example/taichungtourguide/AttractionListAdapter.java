package com.example.taichungtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AttractionListAdapter extends ArrayAdapter<ItemPlaced> {
    /**
     * This is the constructor of Item.
     * @param context is used to inflate layout file.
     * @param itemPlaced is the data we want to populate into the list.
     */
    public AttractionListAdapter(@NonNull Context context, ArrayList<ItemPlaced> itemPlaced) {
        super(context, 0, itemPlaced);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null){
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_format, parent, false);
        }

        //Get the object {@link Item} located at this position in the list
        ItemPlaced itemPlaced = getItem(position);

        //Get photo to the list.
        ImageView imagePhoto = (ImageView) v.findViewById(R.id.imagePhoto);
        imagePhoto.setImageResource(itemPlaced.getPhoto());

        //Get the name of the item
        TextView txt_itemName = (TextView) v.findViewById(R.id.txt_itemName);
        txt_itemName.setText(itemPlaced.getName());

        //Get the additional information for the item
        TextView txt_itemAdditionalInfo = (TextView) v.findViewById(R.id.txt_itemAdditionalInfo);
        if (itemPlaced.hasAdditionalInfo()){
            txt_itemAdditionalInfo.setText(itemPlaced.getAdditionalInfo());
            txt_itemAdditionalInfo.setVisibility(View.VISIBLE);
        }
        else {
            txt_itemAdditionalInfo.setVisibility(View.GONE);
        }
        return v;
    }
}
