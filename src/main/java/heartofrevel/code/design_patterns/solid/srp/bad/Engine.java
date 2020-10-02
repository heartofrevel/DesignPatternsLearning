package heartofrevel.code.design_patterns.solid.srp.bad;

public class Engine {
	
	String make;
	String model;
	String year;
	
	void run() {
		System.out.println("Engine:run");		
	}
	
	void serviceEngine() {
		System.out.println("Engine:serviceEngine");
	}
}
