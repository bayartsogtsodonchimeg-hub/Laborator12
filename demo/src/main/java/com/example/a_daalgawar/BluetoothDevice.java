package com.example.a_daalgawar;
public class BluetoothDevice{
    public static BluetoothDevice single_instance = null;
    public String deviceName;
    private BluetoothDevice(){
        deviceName = "Connected name: AirPods Pro";
    }
    public static synchronized BluetoothDevice getInstance(){
        if(single_instance == null)
            single_instance = new BluetoothDevice();
            return single_instance;
    }
}