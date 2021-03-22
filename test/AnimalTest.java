package test;

import java.util.ArrayList;

import model.idemo.Animal;
import model.idemo.Bird;
import model.idemo.Dog;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog(50, 50, "Bulldog", 3, "White"));
        animals.add(new Bird(100, 100, "Eagle", 5, 10));
        animals.add(new Dog(150, 150, "Poodle", 3, "brown"));
        animals.add(new Bird(200, 200, "Sparrow", 1, 2));

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        for (Animal animal : animals) {
            String m = "" + animal;
            if (animal instanceof Dog) {
                assert m.contains("Dog");
            }
            else if (animal instanceof Bird) {
                assert m.contains("Bird");
            }
        }
    }
}
