package org.example;


import org.example.resorts.EastCoastResort;
import org.example.resorts.WestCoastResort;

public class Main {


    public static void main(String[] args) {
        WestCoastResort palisades = new WestCoastResort("Palisades", "Tahoe", 90);
        WestCoastResort keystone = new WestCoastResort("Keystone", "Colorado", 78);
        EastCoastResort okemo = new EastCoastResort("Okemo", "Vermont", 40);
    }
}