package org.example.passholders;

public interface Passholder {

    String getName();
    void update(String updateType, String... args);
}
