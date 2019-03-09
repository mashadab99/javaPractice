package serializationTest.relationship.IsA;

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
		Student student = init();

		try {
			write(student);

			read();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static void read() throws FileNotFoundException, IOException, ClassNotFoundException {
		

		System.out.println("Reading Object Start");

		FileInputStream fileInputStream = new FileInputStream("d:\\address.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Student student = (Student) objectInputStream.readObject();

		objectInputStream.close();

		System.out.println(student);

		System.out.println("Reading Object End");
	}

	private static void write(Student student) throws FileNotFoundException, IOException {
		System.out.println("Writing Object Start");

		FileOutputStream fileOutputStream = new FileOutputStream("d:\\address.ser");

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(student);
		objectOutputStream.close();

		System.out.println("Writing Object Over");
	}

	private static Student init() {
		Student student = new Student();
		student.setId(1);
		student.setName("Ashif");
		student.setCourse("Java");
		student.setFee(100);
		return student;
	}

}
