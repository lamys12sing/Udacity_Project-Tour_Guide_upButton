package com.example.taichungtourguide;

/**
 * {@link ItemPlaced} represents name of the attraction and contain the photo of the attraction.
 */

public class ItemPlaced {
    private String name;
    private String additionalInfo;
    private int photoId;

    public ItemPlaced(String name, int photoId){
        this.name = name;
        this.photoId = photoId;
    }

    public ItemPlaced(String name, String additionalInfo, int photoId){
        this.name = name;
        this.additionalInfo = additionalInfo;
        this.photoId = photoId;
    }

    public String getName(){
        return name;
    }

    public String getAdditionalInfo(){
        return additionalInfo;
    }

    public int getPhoto(){
        return photoId;
    }

    public boolean hasAdditionalInfo(){
        return additionalInfo != null;
    }
}
