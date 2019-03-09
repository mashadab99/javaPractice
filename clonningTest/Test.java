package clonningTest;

public class Test {

	public static void main(String[] args) {
		Employee orginalObj = init();
        
        try {
        	//System.out.println("Going to Clone");
			Employee clonedObj=(Employee) orginalObj.clone();
			//System.out.println("--Cloned--");
			
			printContent(orginalObj, clonedObj);
			
			printEquality(orginalObj, clonedObj);
			
			twist(orginalObj, clonedObj);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

	private static void twist(Employee orginalObj, Employee clonedObj) {
		//clonedObj.setEmpoyeeId(3);
		//orginalObj.setEmpoyeeId(3);
		
		//clonedObj.getDepartment().setName("Admin");
		//orginalObj.getDepartment().setName("Admin");
		//printContent(orginalObj, clonedObj);
	}

	private static void printEquality(Employee orginalObj, Employee clonedObj) {
		boolean memoryAddFlag=orginalObj != clonedObj;
		System.out.println("Pointing different memory addresses(orginalObj != clonedObj)? "+memoryAddFlag);
 
		boolean isSameClass=orginalObj.getClass() == clonedObj.getClass();
		System.out.println("From same class(orginalObj.getClass() == clonedObj.getClass())? "+isSameClass);

		boolean sameReference=orginalObj.equals(clonedObj);
		System.out.println("Pointing for same references(orginalObj.equals(clonedObj))? "+sameReference);
	}

	private static void printContent(Employee orginalObj, Employee clonedObj) {
		System.out.println("-------orginalObj-START------");
		System.out.println(orginalObj);
		System.out.println("-------clonedObj-START------");
		System.out.println(clonedObj);
		System.out.println("---------------");
	}

	private static Employee init() {
		Department department = new Department(1, "HR");
        Employee employee = new Employee(1, "Ashif", department);
		return employee;
	}

}
