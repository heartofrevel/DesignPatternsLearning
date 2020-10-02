package heartofrevel.code.design_patterns.singleton.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import heartofrevel.code.design_patterns.singleton.impl.SingletonEnum;

public class SingletonEnumClient {

	public static void main(String[] args) {
		try {
			
			SingletonEnum obj1 = SingletonEnum.INSTANCE;
			ObjectOutput objectOutput = new ObjectOutputStream(
					new FileOutputStream("singletonEnum.file"));
			objectOutput.writeObject(obj1);
			objectOutput.close();
			
			ObjectInput objectInput = new ObjectInputStream(
					new FileInputStream("singletonEnum.file"));
			SingletonEnum obj2 = (SingletonEnum) objectInput.readObject();
			objectInput.close();
			
			System.out.println("OBJ1 : "+ obj1 + " Hashcode : "+ obj1.hashCode());
			System.out.println("OBJ2 : "+ obj2 + " Hashcode : "+ obj2.hashCode());
		}catch (Exception e) {
			
		}
		

	}

}
