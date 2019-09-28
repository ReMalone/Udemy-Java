package com.ReMalone;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }

    // public void setTitle(){
   //     this.title = title;
   // }

   // public double getDuration(){
   //     return duration;
   // }

   // public void setDuration(){
   //     this.duration = duration;
   // }


}
