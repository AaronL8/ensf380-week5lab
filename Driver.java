package edu.ucalgary.oop;

public class Driver {
    private String name;

    // Constructor
    public Driver(String name) {
        this.name = name;
    }

    // Copy Constructor
    public Driver(Driver other) {
        this.name = other.name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{name='" + name + "'}";
    }
}

