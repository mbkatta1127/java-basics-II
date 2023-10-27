package Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        
        var dog = new Dog(); 
        var cat = new Cat(); 

        animals.add(dog); 
        animals.add(cat); 

        for(Animal a: animals){
            System.out.println(a.name());
        }
    }
}
