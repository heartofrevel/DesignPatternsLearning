package heartofrevel.code.design_patterns.solid.ocp.good;

public class PetrolEngine implements Engine{

	public void start() {
		System.out.println("Petrol engine taking petrol fuel to start.");
	}

	public void stop() {
		System.out.println("Engine stopping");
	}

}
