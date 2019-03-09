package clonningTest;

public class Department implements Cloneable{
	private int id;
	private String name;

	public Department() {
		super();
		//System.out.println("Department-No arg constructor called");
	}

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		//System.out.println("Department-Parameter arg constructor called");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("I am Department class clone() method");
		return super.clone();
	}*/

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
