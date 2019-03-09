package serializationTest.relationship.IsA;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student extends Person implements Serializable  {
	 private static final long serialVersionUID = 1L;
	String course;
	int fee;

	public Student() {
		super();
	}

	public Student(int id, String name, String course, int fee) {
		super(id, name);
		this.course = course;
		this.fee = fee;
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

	@Override
	public String toString() {
		return "Student [course=" + course + ", fee=" + fee + ", id=" + id + ", name=" + name + "]";
	}

	/*private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		setId(ois.readInt());
		setName((String) ois.readObject());

	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();

		oos.writeInt(getId());
		oos.writeObject(getName());
	}*/

	

}
