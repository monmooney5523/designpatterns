package org.example.passholders;

public abstract class AbstractPassholder implements Passholder {
    private String name;

    public AbstractPassholder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String updateType, String... args) {
        // Default implementation for update method
        switch (updateType) {
            case "snowTotals":
                System.out.printf("UPDATE for %s: Currently the base at %s is %s%n", name, args[0], args[1]);
                break;
            case "liftStatus":
                System.out.printf(
                        "UPDATE for %s: Currently the lifts at %s are %s running%n",
                        name,
                        args[0],
                        args[1].equals("true") ? "" : "not"
                );
                break;
            default:
                break;
        }
    }
}

