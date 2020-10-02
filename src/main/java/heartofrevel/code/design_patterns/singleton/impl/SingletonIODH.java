package heartofrevel.code.design_patterns.singleton.impl;

public class SingletonIODH {
	private SingletonIODH() {}
	
	private static class InstanceHolder{
		static SingletonIODH INSTANCE = new SingletonIODH();
	}
	
	public static SingletonIODH getInstance() {
		return InstanceHolder.INSTANCE;
	}
}
