package heartofrevel.code.design_patterns.solid.ocp.bad;

public class Car {
	String year;
	String make;
	String model;
	
	public void run(DieselEngine engine) {
		System.out.println("Starting Engine to run car.");
		engine.start();
	}
}
