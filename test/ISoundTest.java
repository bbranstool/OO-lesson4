package test;

import java.util.ArrayList;

import model.idemo.Airplane;
import model.idemo.Bird;
import model.idemo.Car;
import model.idemo.Dog;
import model.idemo.ISound;

public class ISoundTest {
    public static void main(String[] args) {
        ArrayList<ISound> sounds = new ArrayList<ISound>();
        sounds.add(new Dog(50, 50, "Bulldog", 3, "White"));
        sounds.add(new Bird(100, 100, "Eagle", 5, 10));
        sounds.add(new Dog(150, 150, "Poodle", 3, "brown"));
        sounds.add(new Bird(200, 200, "Sparrow", 1, 2));
        sounds.add(new Car(4, 10, "Ford", 9000, "Sedan"));
        sounds.add(new Airplane(100, 100, "Boeing", 500000, 350));
        sounds.add(new Car(40, 60, "GM", 9000, "SUV"));
        sounds.add(new Airplane(500, 700, "Airbus", 700000, 250));

        for (ISound sound : sounds) {
            System.out.println(sound.getSound());
            String mSound = sound.getSound();

            if (sound instanceof Dog) {
                assert mSound.contains("Dog");
            }
            else if (sound instanceof Bird) {
                assert mSound.contains("Bird");
            }
            else if (sound instanceof Car) {
                assert mSound.contains("Car");
            }
            else if (sound instanceof Airplane) {
                assert mSound.contains("Airplane");
            }
        }
    }
}
