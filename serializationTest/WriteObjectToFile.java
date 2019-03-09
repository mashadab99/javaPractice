package serializationTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class WriteObjectToFile {
	public static void main(String args[]) {

		Address address = init();

		try {
			System.out.println("Writing Object Start");
			
			FileOutputStream fileOutputStream = new FileOutputStream("d:\\address.ser");
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			/*System.out.println("Present Version id of Address1 is :: "
					+ ObjectStreamClass.lookup(Address.class).getSerialVersionUID());*/
			objectOutputStream.writeObject(address);
			objectOutputStream.close();
			/*System.out.println("Present Version id of Address2 is :: "
					+ ObjectStreamClass.lookup(Address.class).getSerialVersionUID());*/
			System.out.println("Writing Object Over");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static Address init() {
		Address address = new Address();
		
		address.setStreet("Laxmi Nagar");
		address.setCountry("India");
		
		return address;
	}
}
