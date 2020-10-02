package heartofrevel.code.design_patterns.solid.ocp.good;

public class Car {
	String year;
	String make;
	String model;
	
	public void run(Engine engine) {
		System.out.println("Starting Engine to run car.");
		engine.start();
	}
}
