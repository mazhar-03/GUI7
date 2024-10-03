import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal bear = new Animal("Bear", 250, 260, 16);
        Animal snake = new Animal("Snake", 26, 97, 25);
        Animal lion = new Animal("Lion", 140, 75, 62);
        Animal elephant = new Animal("Elephant", 740, 420, 10);

        animals.add(bear);
        animals.add(snake);
        animals.add(lion);
        animals.add(elephant);

        ArrayList<Animal> longAnimals1 = new ArrayList<>();
        for(Animal a : animals){
            if(a.height > 100) longAnimals1.add(a);
        }
        longAnimals1.forEach(System.out::println);

        List<String> longAnimals2 = animals.stream().filter(animal -> animal.height > 100).map(Animal::getName).toList();
        longAnimals2.forEach(System.out::println);
    }
}
