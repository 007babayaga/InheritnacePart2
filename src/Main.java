public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("herbivore","bigOne",400.0);
        AnimalStuff(animal,"slow");
        Dog dog =new Dog();
        AnimalStuff(dog,"fast");
    }
    public static void AnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");

    }


}
