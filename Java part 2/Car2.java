public class Car2 {
    String model;
    String color;

    Car2 (String model, String color){
        this.color = color;
        this.model = model;
    }

    void drive(){
        System.out.println("You drive "+ this.color + " " + this.model);
    }
}
