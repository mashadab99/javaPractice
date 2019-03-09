package serializationTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class ReadObjectFromFile {

	public static void main(String[] args) {
		try {
			System.out.println("Present Version id of Address is :: "
					+ ObjectStreamClass.lookup(Address.class).getSerialVersionUID());
			
			System.out.println("Reading Object Start");
			
			FileInputStream fileInputStream = new FileInputStream("d:\\address.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Address address = (Address) objectInputStream.readObject();

			objectInputStream.close();

			System.out.println(address);
			

			System.out.println("Reading Object End");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
