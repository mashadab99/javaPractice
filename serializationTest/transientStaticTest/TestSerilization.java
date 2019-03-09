package serializationTest.transientStaticTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

import serializationTest.Address;

public class TestSerilization {

	public static void main(String[] args) {
		Person person = init();

		try {
			write(person);

			read();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static void read() throws FileNotFoundException, IOException, ClassNotFoundException {
		

		System.out.println("Reading Object Start");

		FileInputStream fileInputStream = new FileInputStream("d:\\address.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person person = (Person) objectInputStream.readObject();

		objectInputStream.close();

		System.out.println(person);

		System.out.println("Reading Object End");
	}

	private static void write(Person person) throws FileNotFoundException, IOException {
		System.out.println("Writing Object Start");

		FileOutputStream fileOutputStream = new FileOutputStream("d:\\address.ser");

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(person);
		objectOutputStream.close();

		System.out.println("Writing Object Over");
	}

	private static Person init() {
		Person person = new Person();
		person.setFirstName("Ashif");
		person.setLastName("Shadab");
		person.setMiddleName("ABC");
		person.setPetName("XYZ");
		
		return person;
	}

}
