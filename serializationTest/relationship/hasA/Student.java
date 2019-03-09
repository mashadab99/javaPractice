package serializationTest.relationship.hasA;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student  implements Serializable{
	 private static final long serialVersionUID = 1L;
	String course;
	int fee;
	private int id;
	String name;
	
	private Person person;

	public Student() {
		super();
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", fee=" + fee + ", person=" + person + "]";
	}

	
	

	/*private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		person.setId(ois.readInt());
		person.setName((String) ois.readObject());

	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();

		oos.writeInt(person.getId());
		oos.writeObject(person.getName());
	}*/

	

}
