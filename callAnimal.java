public class callAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 300);

        doAnimalStuff(animal, "fast");

        Dog dog = new Dog();
        Dog yorkie = new Dog("Yorkie", 15, "medium");
        Dog wolf = new Dog("Wolf", 15, "Big");
        Fish fish = new Fish("Goldfish", 0.21, 1, 2);

        doAnimalStuff(fish, "fast");

        doAnimalStuff(dog, "1MPH");

        doAnimalStuff(yorkie, "slow");

        doAnimalStuff(wolf, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }
}
