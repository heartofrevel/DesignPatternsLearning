package heartofrevel.code.design_patterns.singleton.hack;

import java.lang.reflect.Constructor;

import heartofrevel.code.design_patterns.singleton.impl.SingletonIODH;

public class BreakByReflection {
	public static void main(String[] args) {
		SingletonIODH obj1 = SingletonIODH.getInstance();
		SingletonIODH obj2 = null;
		try {
			Constructor[] constructorList = SingletonIODH.class.getDeclaredConstructors();
			for (Constructor constructor : constructorList) {
				constructor.setAccessible(true);
				obj2 = (SingletonIODH) constructor.newInstance();
				break;
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("OBJ1 : "+ obj1 + " Hashcode : "+ obj1.hashCode());
		System.out.println("OBJ2 : "+ obj2 + " Hashcode : "+ obj2.hashCode());
	}
}