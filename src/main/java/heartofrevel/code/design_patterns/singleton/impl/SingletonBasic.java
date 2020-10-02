package heartofrevel.code.design_patterns.singleton.impl;

public class SingletonBasic {
	
	private SingletonBasic() {
		System.out.println("SingletonBasic:SingletonBasic");
	}
	
	private static SingletonBasic INSTANCE = null;
	
	
	public static SingletonBasic getInstance() {
		System.out.println("SingletonBasic:getInstance");
		if(INSTANCE == null) {
			INSTANCE =  new SingletonBasic();
		}
		return INSTANCE;
	}
	
	public void printHello() {
		System.out.println("SingletonBasic:printHello");
	}
}
