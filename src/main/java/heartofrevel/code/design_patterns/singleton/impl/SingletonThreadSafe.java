package heartofrevel.code.design_patterns.singleton.impl;

public class SingletonThreadSafe {
	
	private SingletonThreadSafe() {
		System.out.println("SingletonThreadSafe:SingletonThreadSafe");
	}
	
	private static volatile SingletonThreadSafe INSTANCE = null;
	
	
	public static SingletonThreadSafe getInstance() {
		System.out.println("SingletonThreadSafe:getInstance");
		if(INSTANCE == null) {
			synchronized (SingletonThreadSafe.class) {
				if (INSTANCE == null) {
					INSTANCE =  new SingletonThreadSafe();
				}
			}			
		}
		return INSTANCE;
	}
	
	public void printHello() {
		System.out.println("SingletonThreadSafe:printHello");
	}
}