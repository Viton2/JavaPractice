package Practicing.testing.lambda;

public class Lambda {

    public static void main(String[] args) {

        // 1
        Cat cat = new Cat();
        cat.print();

        // 2
        printThing(cat);

        // 3
        printThing(() -> System.out.println("Meow"));

        // 4
        printThing(() -> System.out.println("Meow"));

        // 5
        Printable printable = () -> System.out.println("Meow");
        printThing(printable);
    }

    static void printThing(Printable thing){
        thing.print();
    }
}
