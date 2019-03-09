package objectCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class ObjectCreation {

	public static void main(String[] args) {
		// By using new keyword
		//usingNewKeyword();

		// By using Class class's newInstance() method
		 //classNewInstanceMethod();

		// By using Constructor class's newInstance() method
		 //Employee emp3 = constructorClassNewInstanceMethod();

		// By using clone() method
		 //Employee emp4 = usingcloning(emp3);

		// By using Deserialization
		 //usingDeserialization(emp4);

	}

	private static void usingDeserialization(Employee emp4) {
		try {
			serializeObj(emp4);

			Employee emp5 = deserialization();

			emp5.setName("Akash");
			System.out.println(emp5 + ", hashcode : " + emp5.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Employee deserialization() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/data.obj"));
		Employee emp5 = (Employee) in.readObject();
		in.close();
		return emp5;
	}

	private static void serializeObj(Employee emp4) throws IOException, FileNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/data.obj"));
		out.writeObject(emp4);
		out.close();
	}

	private static Employee usingcloning(Employee emp3) {
		Employee emp4 = (Employee) emp3.clone();
		emp4.setName("Atul");

		System.out.println(emp4 + ", hashcode : " + emp4.hashCode());
		return emp4;
	}

	private static Employee constructorClassNewInstanceMethod() {
		Employee emp3 = null;
		try {
			Constructor<Employee> constructor = Employee.class.getConstructor();
			emp3 = constructor.newInstance();
			emp3.setName("Yogesh");

			System.out.println(emp3 + ", hashcode : " + emp3.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp3;
	}

	private static void classNewInstanceMethod() {
		try {
			Employee emp2 = (Employee) Class.forName("objectCreation.Employee").newInstance();
			// Employee emp2 = Employee.class.newInstance();

			emp2.setName("Rishi");

			System.out.println(emp2 + ", hashcode : " + emp2.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void usingNewKeyword() {
		Employee emp1 = new Employee();
		emp1.setName("Naresh");

		System.out.println(emp1 + ", hashcode : " + emp1.hashCode());
	}

}
