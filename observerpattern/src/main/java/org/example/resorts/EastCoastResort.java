package org.example.resorts;

public class EastCoastResort extends AbstractSkiResort {

    public EastCoastResort(String name, String location, int snowTotal) {
        super(name, location, snowTotal);
    }

    @Override
    public void shareLiftStatus() {
        System.out.printf("East Coast resort %s has %s inches of snow%n", name, snowTotal);
    }
}
