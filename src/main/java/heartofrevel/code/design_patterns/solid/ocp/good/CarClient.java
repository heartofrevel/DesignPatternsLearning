package heartofrevel.code.design_patterns.solid.ocp.good;

public class CarClient {

	public static void main(String[] args) {
		Engine dieselEngine = new DieselEngine();
		Engine petrolEngine = new PetrolEngine();
		Car car = new Car();
		car.run(dieselEngine);
		car.run(petrolEngine);
	}
}
