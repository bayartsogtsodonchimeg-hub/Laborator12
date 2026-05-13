package com.example.a_daalgawar;
public class Main{
    public static void main(String[] args){
        MusicPlayer x = MusicPlayer.getInstance();
        System.out.println(x.song);
        
        MusicPlayer y = MusicPlayer.getInstance();
        System.out.println(x == y);
    }
}