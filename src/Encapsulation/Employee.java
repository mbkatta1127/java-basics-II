package Encapsulation;

public class Employee extends Person{
    public int salary; 

    public Employee(int salary){
        super("John","Smith",(byte) 53,38594857); 
        this.salary = salary; 
    }
    public String speak(){
        return "My name is " + super.getFirstName() + " and I make " + salary;
    }
}
