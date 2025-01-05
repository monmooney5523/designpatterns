package org.example.resorts;

import org.example.passholders.Passholder;

public interface SkiResort {

    void addSubscriber(Passholder passholder);

    void removeSubscriber(Passholder passholder);

    void shareLiftStatus();

    void shareSnowTotals();
}
