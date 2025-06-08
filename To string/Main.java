public class Main {

    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2008, "Yellow");

        //System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);

        System.out.println(car); // Normally this gives the address of the car like this : Car@28a418fc
    }
}