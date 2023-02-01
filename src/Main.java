public class Main {
    public static void main(String[] args) {
        String txt = "Jonathan";

        Pig myPig = new Pig(); // Create object
        Dog myDog = new Dog();
        Truck myTruck = new Truck();

        Motorcycle myBike = new Motorcycle();


        myTruck.modelName();
        myBike.modelName();
        myPig.animalSound();
        myDog.animalSound();

        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());

    }
}

/*
    Why and when to use "Inheritance" and "Polymorphism"?

    - It is useful for code reusability: reuse attributtes and methods of
    an existing class when you create a new class.
 */
