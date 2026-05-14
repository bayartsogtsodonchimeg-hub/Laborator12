package com.example.a_daalgawar;
public class Main{
    public static void main(String[] args){
        BluetoothDevice x = BluetoothDevice.getInstance();
        System.out.println(x.deviceName);
        
        BluetoothDevice y = BluetoothDevice.getInstance();
        System.out.println(x == y);
    }
}