package Practicing.testing.lambda;

public class Cat implements Printable {

    String name;
    Integer age;

    public Cat() {
    }

    @Override
    public String print(String prefix, String suffix) {
        return prefix + "Meow" + suffix;
    }
}
