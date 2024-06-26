package object1;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John", 30, 120);
        Person person2 = new Person("Doe", 120, 160);
        Person person3 = new Person("Dip", 54, 160);
        Chair chair1 = new Chair("wood", "blue", 4);

        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        Car sedan = new Car("Camry", "Toyota", 2014, 50000);


        System.out.println(Arrays.toString(people));
        System.out.println("My chair is " + chair1.getColor());
    }
}
