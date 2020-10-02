package heartofrevel.code.design_patterns.solid.dip.good;

import heartofrevel.code.design_patterns.solid.ocp.good.Engine;

public class Car {
	public void run(Engine engine) {		
		engine.start();
	}
}
