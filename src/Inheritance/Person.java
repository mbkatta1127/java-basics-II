import java.util.Objects;

public class Person {
    public String firstname;
    public int age; 
    public String lastname; 

    public Person(String firstname, String lastname, int age){
        this.firstname = firstname; 
        this.lastname = lastname; 
        this.age = age; 
    }

    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && firstname.equals(person.firstname) && lastname.equals(person.lastname);
}

@Override
    public int hashCode() {  // Used for Hash* data structures (e.g. prevents dupes in HashSets).
        return Objects.hash(age, firstname, lastname);
    }
}
