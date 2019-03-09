package clonningTest;

public class TestAgain {

	public static void main(String[] args) {

		Person orginalPersonObj = init();
		
		System.out.println(orginalPersonObj);

		try {
			Person clonePersonObj = orginalPersonObj.personClone();
			
			System.out.println(clonePersonObj);

			testCases(orginalPersonObj, clonePersonObj);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

	private static void testCases(Person orginalPersonObj, Person clonePersonObj) {
		boolean isDifferentObjects=orginalPersonObj == clonePersonObj;
		if (isDifferentObjects) { 
			System.out.println("Both person1 and person2 holds same object");
		}else {
			System.out.println("Both person1 and person2 holds diffrent object");
		}

		boolean isSameContent=orginalPersonObj.equals(clonePersonObj);
		if (isSameContent) { 
			System.out.println("But both person1 and person2 are equal and have same content");
		}else {
			System.out.println("But both person1 and person2 are equal and have not same content");
		}

		if (orginalPersonObj.getCity() == clonePersonObj.getCity()) {
			System.out.println("Both person1 and person2 have same city object");
		}
	}

	private static Person init() {
		City city = new City("Dehradun");
		Person orginalPersonObj = new Person(1,"Naresh", 10000, city);
		//System.out.println(orginalPersonObj);
		return orginalPersonObj;
		//Person orginalPersonObjByCopyConstructor=new Person(orginalPersonObj);
		//return orginalPersonObjByCopyConstructor;
	}

}
