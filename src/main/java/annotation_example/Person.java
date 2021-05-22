package annotation_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    public Pet pet;
    public Car car;




    @Autowired
    public Person(@Qualifier ("dog") Pet pet, Car car) {
        this.pet = pet;
        this.car = car;
        System.out.println("Person created");
    }

    public void callPet (){
    pet.petSay();
    }
}
