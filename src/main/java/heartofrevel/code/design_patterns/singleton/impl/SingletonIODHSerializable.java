package heartofrevel.code.design_patterns.singleton.impl;

import java.io.Serializable;

public class SingletonIODHSerializable implements Serializable{

	private SingletonIODHSerializable() {}

	private static class InstanceHolder{
		static SingletonIODHSerializable INSTANCE = new SingletonIODHSerializable();
	}
	
	public static SingletonIODHSerializable getInstance() {
		return InstanceHolder.INSTANCE;
	}
}
