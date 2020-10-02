package heartofrevel.code.design_patterns.singleton.fix;

public class SingletonIODHCloneable implements Cloneable{
	private SingletonIODHCloneable() {}

	@Override
	protected Object clone() throws CloneNotSupportedException {		
		return InstanceHolder.INSTANCE;		
	}
	
	private static class InstanceHolder{
		static SingletonIODHCloneable INSTANCE = new SingletonIODHCloneable();
	}
	
	public static SingletonIODHCloneable getInstance() {
		return InstanceHolder.INSTANCE;
	}
}
