package com.saudisoft.tahamosaad.trafficapp;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Parts_album {
    private String name;
    private int numOfPart;
    private int thumbnail;

    public Parts_album() {
    }

    public Parts_album(String name, int numOfPart, int thumbnail) {
        this.name = name;
        this.numOfPart = numOfPart;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPart() {
        return numOfPart;
    }

    public void setNumOfPart(int numOfPart) {
        this.numOfPart = numOfPart;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
