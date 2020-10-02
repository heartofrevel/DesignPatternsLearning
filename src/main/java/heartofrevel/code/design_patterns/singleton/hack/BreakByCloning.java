package heartofrevel.code.design_patterns.singleton.hack;

import heartofrevel.code.design_patterns.singleton.impl.SingletonIODHCloneable;

public class BreakByCloning {

	public static void main(String[] args) throws CloneNotSupportedException{
		SingletonIODHCloneable obj1 = SingletonIODHCloneable.getInstance();
		SingletonIODHCloneable obj2 = (SingletonIODHCloneable)obj1.clone();
		
		System.out.println("OBJ1 : "+ obj1 + " Hashcode : "+ obj1.hashCode());
		System.out.println("OBJ2 : "+ obj2 + " Hashcode : "+ obj2.hashCode());
		
	}

}