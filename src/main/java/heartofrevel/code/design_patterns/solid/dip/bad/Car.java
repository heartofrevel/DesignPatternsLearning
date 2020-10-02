package heartofrevel.code.design_patterns.solid.dip.bad;

import heartofrevel.code.design_patterns.solid.ocp.good.PetrolEngine;

public class Car {
	public void run() {
		PetrolEngine petrolEngine = new PetrolEngine();
		petrolEngine.start();
	}
}
