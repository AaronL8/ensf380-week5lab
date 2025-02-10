package edu.ucalgary.oop;
import edu.ucalgary.oop.Driver;
import edu.ucalgary.oop.Engine;

public class Car {
	private String model;
	private Driver driver;
	private Engine engine;
	
	public Car(String model, Driver driver, Engine engine) {
		this.model = model;
		this.driver = driver;
		this.engine = engine;
	}
	
	public Car copy(boolean deepCopy) {
		if(deepCopy) {
			Driver driver_copy = new Driver(this.driver);
			Engine engine_copy = new Engine(this.engine);
			return new Car(this.model, driver_copy, engine_copy);
		}
		else {
			return new Car(this.model, this.driver, this.engine);
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
