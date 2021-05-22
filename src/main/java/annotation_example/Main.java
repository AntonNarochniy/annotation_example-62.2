package annotation_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
// создал контекст
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
        //создал персону,
        Person person = context.getBean("personBean", Person.class);
        //вызвал метод callPet(), так как в конструкторе Person указано @Qualifier ("dog") то питомец для Person добавлен Dog
        // объект Cat не создан, потому что он не был создан из контекста, а скоуп у него prototype
        person.callPet();
        //закрыл контекст
        context.close();

    }
}
