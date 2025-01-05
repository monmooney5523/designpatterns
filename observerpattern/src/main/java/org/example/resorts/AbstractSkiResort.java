package org.example.resorts;

import org.example.passholders.Passholder;

import java.util.ArrayList;

public class AbstractSkiResort implements SkiResort {

    String name;
    String location;
    int snowTotal;
    ArrayList<Passholder> passholders;

    public AbstractSkiResort(String name, String location, int snowTotal){
        this.name = name;
        this.location = location;
        this.snowTotal = snowTotal;
        this.passholders = new ArrayList<>();
        System.out.printf("Created ski resort %s%n", name);
    }

    public void updateSnowTotal(int snowTotal){
        this.snowTotal = snowTotal;
    }

    @Override
    public void addSubscriber(Passholder passholder) {
        passholders.add(passholder);
    }

    @Override
    public void removeSubscriber(Passholder passholder) {
        passholders.remove(passholder);
    }

    @Override
    public void shareLiftStatus() {

    }
}
