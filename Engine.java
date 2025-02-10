package edu.ucalgary.oop;

public class Engine {
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    // copy constructor
    public Engine(Engine other) {
        this.engineType = other.engineType;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
