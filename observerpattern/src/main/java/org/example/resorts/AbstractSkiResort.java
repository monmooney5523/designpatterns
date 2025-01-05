package org.example.resorts;

import org.example.passholders.Passholder;

import java.util.ArrayList;

public abstract class AbstractSkiResort implements SkiResort {

    String name;
    String location;
    int snowTotal;
    ArrayList<Passholder> passholders;
    boolean isLiftActive;

    public AbstractSkiResort(String name, String location, int snowTotal){
        this.name = name;
        this.location = location;
        this.snowTotal = snowTotal;
        this.passholders = new ArrayList<>();
        this.isLiftActive = false;
        System.out.printf("Created ski resort %s%n", name);
    }

    public void updateSnowTotal(int snowTotal){
        this.snowTotal = snowTotal;
        shareSnowTotals();
    }

    public void updateActiveLift(boolean isLiftActive){
        this.isLiftActive = isLiftActive;
        shareLiftStatus();
    }

    @Override
    public void addSubscriber(Passholder passholder) {
        if(!passholders.contains(passholder)) {
            passholders.add(passholder);
            System.out.printf("Successfully added subscriber %s to %s%n", passholder.getName(), name);
        }else{
            System.out.printf("Passholder %s is already a subscriber%n", passholder.getName());
        }
    }

    @Override
    public void removeSubscriber(Passholder passholder) {
        if(passholders.contains(passholder)) {
            passholders.remove(passholder);
            System.out.printf("Successfully removed subscriber %s from %s%n", passholder.getName(), name);
        }else{
            System.out.printf("Cannot remove non-subscriber %s%n", passholder.getName());
        }
    }

    @Override
    public void shareLiftStatus() {
        for(Passholder p: passholders){
            p.update("liftStatus", name, String.valueOf(isLiftActive));
        }
    }

    @Override
    public void shareSnowTotals() {
        for(Passholder p: passholders){
            p.update("snowTotals", name, String.valueOf(snowTotal));
        }
    }
}
