package com.example.tashtash.listview;

/**
 * Created by User on 16/11/2015.
 */

public class TaskItem {
    private String 	description;
    private int done;
    private int imageResource;

    public TaskItem(String description, int done , int imageResource) {
        super();
        this.description = description;
        this.done = done;
        this.imageResource = imageResource;
    }

    public String getDescription() {
        return description;
    }

    public int getDone() {
        return done;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(int done) {
        this.done = done;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
