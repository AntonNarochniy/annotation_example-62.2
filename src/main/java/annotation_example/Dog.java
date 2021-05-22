package annotation_example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
// обсласть видимости prototype тебуется тогда, когда нужно иметь неограниченное экземпляров бина
@Scope("prototype")
public class Dog implements Pet{


    @Override
    public void petSay() {
        System.out.println("гав-гав");
    }

    public Dog() {
        System.out.println("Dog created");
    }
}
