package heartofrevel.code.design_patterns.singleton.impl;

public class SingletonIODHCloneable implements Cloneable{
	private SingletonIODHCloneable() {}

	@Override
	public Object clone() throws CloneNotSupportedException {		
		return super.clone();
	}
	
	private static class InstanceHolder{
		static SingletonIODHCloneable INSTANCE = new SingletonIODHCloneable();
	}
	
	public static SingletonIODHCloneable getInstance() {
		return InstanceHolder.INSTANCE;
	}
}