package org.example.resorts;

public class WestCoastResort extends AbstractSkiResort {


    public WestCoastResort(String name, String location, int snowTotal) {
        super(name, location, snowTotal);
    }

    @Override
    public void shareLiftStatus() {
        System.out.printf("West Coast resort %s has %s inches of snow%n", name, snowTotal);
    }
}
