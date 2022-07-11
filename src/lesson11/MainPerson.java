package lesson11;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Ivan",30);
        Person person1 = new Person("Elena",25);
        System.out.println(person.equals(person1));
        System.out.println(person);
       person.test(20);
        // a = b b=c c=a
        // a=b b=a
        // a=b a=b

        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
//71029023
//2078269320

    }
}

