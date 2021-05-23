package hashMapTest;

import java.util.Objects;

public class Person {
    private int personId;
    private String name;

    public Person(int personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, name);
    }
}
