package annotation_example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
 class Cat implements Pet {

    public Cat() {
        System.out.println("cat created");
    }

    @Override
    public void petSay() {
        System.out.println("мяу");
    }


}
