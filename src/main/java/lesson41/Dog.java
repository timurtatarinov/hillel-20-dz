package lesson41;

public class Dog implements AbleToMakeSound {

    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    /* (2)
    public void makeSound() {
        System.out.println("Make sound.");
    }
    */

}