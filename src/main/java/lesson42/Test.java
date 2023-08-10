package lesson42;

import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        // animal1          ->          {1}
        // animal1          ->          {1}

        /* (2)
        Animal animal1 = new Animal(1);
        Animal animal2 = animal1; //new Animal(2);

        System.out.println(animal1 == animal2);
        */

        /* (1)
        Object object = new Object();
        object.equals();
        */

        /* (3)
        String string1 = new String("Hello"); // string1    ->      {"Hello"}
        String string2 = new String("Hello"); // string2    ->      {"Hello"}

        System.out.println(string1 == string2);
        */

        String a = "hello";
        String b = "hello123".substring(0, 5);

        System.out.println(b);
        System.out.println(a == b);


    }

}

class Animal {

    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}