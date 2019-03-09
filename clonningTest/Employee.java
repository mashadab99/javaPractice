package clonningTest;

public class Employee implements Cloneable {
	private int empoyeeId;
	private String employeeName;
	private Department department;

	public Employee() {
		super();
		//System.out.println("Employee-No arg constructor called");
	}

	public Employee(int empoyeeId, String employeeName, Department department) {
		super();
		this.empoyeeId = empoyeeId;
		this.employeeName = employeeName;
		this.department = department;
		//System.out.println("Employee-Parameter arg constructor called");
	}

	public int getEmpoyeeId() {
		return empoyeeId;
	}

	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//System.out.println("I am Employee class clone() method");
		return super.clone();
	}
	
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("I am Employee class clone() method");
	    Employee cloned = (Employee)super.clone();
	    cloned.setDepartment((Department)cloned.getDepartment().clone());  
	    return cloned;
	}*/

	@Override
	public String toString() {
		return "Employee [empoyeeId=" + empoyeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}

}
