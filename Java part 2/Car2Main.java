public class Car2Main {
    public static void main(String[] args) {
        Car2[] cars = {new Car2("Ford", "Blue"), 
                       new Car2("Lamboghini", "Yellow"),
                       new Car2("Ferrari", "Red")};
        
        for (Car2 car : cars){
            car.drive();
        }
        System.out.println("\n");
        for (Car2 car : cars){
            car.color = "Black";
            car.drive();
        }
    }
}
