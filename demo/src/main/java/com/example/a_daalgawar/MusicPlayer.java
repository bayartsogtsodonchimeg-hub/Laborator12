package com.example.a_daalgawar;
public class MusicPlayer{
    public static MusicPlayer single_instance = null;
    public String song;
    private MusicPlayer(){
        song = "Playing: Bodliin gunees";
    }
    public static synchronized MusicPlayer getInstance(){
        if(single_instance == null)
            single_instance = new MusicPlayer();
            return single_instance;
    }
}