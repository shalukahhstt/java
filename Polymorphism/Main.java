public class Main {
    public static void main(String[] args){
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicle[] vehicles = {car,bike,boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}

// We can use use interfaces for this also 

//Runtime polymorphism
/*
  public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism = When the method that gets executed is decided
        //                                               at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): "); // we just input the class we made in the runtime
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}
 */