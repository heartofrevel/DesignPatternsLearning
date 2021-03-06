package heartofrevel.code.design_patterns.singleton.impl;

public class SingletonEager {
	
	private static final SingletonEager INSTANCE = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		return INSTANCE;
	}
}