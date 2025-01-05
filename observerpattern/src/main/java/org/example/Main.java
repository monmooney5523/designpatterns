package org.example;


import org.example.passholders.Skier;
import org.example.passholders.Snowboarder;
import org.example.resorts.EastCoastResort;
import org.example.resorts.WestCoastResort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        WestCoastResort alta = new WestCoastResort("Alta", "Utah", 88);
        WestCoastResort palisades = new WestCoastResort("Palisades", "Tahoe", 90);
        WestCoastResort keystone = new WestCoastResort("Keystone", "Colorado", 78);
        EastCoastResort okemo = new EastCoastResort("Okemo", "Vermont", 40);

        Skier skier1 = new Skier("Monica");
        Skier skier2 = new Skier("Tom");
        Snowboarder snowbarder1 = new Snowboarder("John");

        // Create a list of tasks to execute
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(() -> palisades.addSubscriber(skier1));
        tasks.add(() -> keystone.addSubscriber(skier1));
        tasks.add(() -> keystone.addSubscriber(skier2));
        tasks.add(() -> alta.addSubscriber(snowbarder1));
        tasks.add(() -> okemo.addSubscriber(snowbarder1));
        tasks.add(() -> keystone.removeSubscriber(skier1));
        tasks.add(() -> okemo.addSubscriber(skier1));

        tasks.add(alta::shareSnowTotals);
        tasks.add(keystone::shareLiftStatus);
        tasks.add(() -> palisades.updateSnowTotal(120));

        // Shuffle the list to randomize the order
        Collections.shuffle(tasks);

        // Execute the tasks in random order
        for (Runnable task : tasks) {
            task.run();
        }
    }
}