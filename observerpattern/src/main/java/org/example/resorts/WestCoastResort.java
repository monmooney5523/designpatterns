package org.example.resorts;

import org.example.passholders.Passholder;
import org.example.passholders.Snowboarder;

import java.util.Objects;

public class WestCoastResort extends AbstractSkiResort {


    public WestCoastResort(String name, String location, int snowTotal) {
        super(name, location, snowTotal);
    }

    @Override
    public void addSubscriber(Passholder passholder) {
        if(passholder instanceof Snowboarder && Objects.equals(name, "Alta")){
            System.out.println("Snowboarders cannot subscribe to Alta");
        }else {
            passholders.add(passholder);
            System.out.printf("Successfully added subscriber %s to %s%n", passholder.getName(), name);
        }
    }
}
