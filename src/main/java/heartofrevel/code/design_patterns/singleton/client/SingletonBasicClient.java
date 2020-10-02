package heartofrevel.code.design_patterns.singleton.client;

import heartofrevel.code.design_patterns.singleton.impl.SingletonBasic;

public class SingletonBasicClient {

	public static void main(String[] args) {		
		SingletonBasic obj = SingletonBasic.getInstance();
		obj.printHello();
		SingletonBasic obj1 = SingletonBasic.getInstance();
		obj1.printHello();
	}

}
