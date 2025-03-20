package Practicing.testing.lambda;

public class Lambda {

    public static void main(String[] args) {

        // 1 Traditional use of an interface implementation by a class (Cat).
        Cat cat = new Cat();
        cat.print("The Cat said: ", "!");

        // 2 Using a class (Cat) that implements the Printable interface as parameter.
        printThing(cat);

        // 3
        printThing((p, s) -> p + "Meow" + s);

        // 4 print() method returns a String
        printThing((p, s) -> {
            System.out.println(p + "Meow" + s);
            return p + "Meow" + s;
        });

        // 5 giving a Printable interface variable the value of the expression and using it as parameter.
        Printable printable = (p, s) -> p + "Meow" + s;
        printThing(printable);

    }

    static void printThing(Printable thing) {
        System.out.println(thing.print("The Cat said: ", "!"));
    }
}
