package heartofrevel.code.design_patterns.solid.ocp.good;

public class DieselEngine implements Engine {
	
	public void start() {
		System.out.println("Diesel engine taking diesel fuel to start");
	}
	
	public void stop() {
		System.out.println("Engine stopping");
	}
}
