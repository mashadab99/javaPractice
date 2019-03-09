package clonningTest;

public class Person implements Cloneable {
	private final int id;
	private String name;
	private int income;
	private City city;

	

	public Person(int id,String name, int income, City city) {
		super();
		this.id=id;
		this.name = name;
		this.income = income;
		this.city = city;
	}

	
	public Person(Person original) {
	    this.id = original.id + 1;
	    this.name = new String(original.name);
	    this.city = new City(original.city);
	}

	public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", income=" + income + ", city=" + city + "]";
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + income;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (income != other.income)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/

	

	public Person personClone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}
}
