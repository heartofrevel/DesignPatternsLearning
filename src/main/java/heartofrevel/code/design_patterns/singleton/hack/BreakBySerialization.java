package heartofrevel.code.design_patterns.singleton.hack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import heartofrevel.code.design_patterns.singleton.impl.SingletonIODHSerializable;

public class BreakBySerialization {
	public static void main(String[] args) {
		try {
			SingletonIODHSerializable obj1 = SingletonIODHSerializable.getInstance();
			ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("singleton.file"));
			objectOutput.writeObject(obj1);
			objectOutput.close();
			
			ObjectInput objectInput = new ObjectInputStream(new FileInputStream("singleton.file"));
			SingletonIODHSerializable obj2 = (SingletonIODHSerializable) objectInput.readObject();
			objectInput.close();
			
			System.out.println("OBJ1 : "+ obj1 + " Hashcode : "+ obj1.hashCode());
			System.out.println("OBJ2 : "+ obj2 + " Hashcode : "+ obj2.hashCode());
			
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
}
