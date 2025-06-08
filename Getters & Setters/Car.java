public class Car {

    private final String model; // final is used to makee the the value iput in that variable a constant 
                                // if there's no value assigned we can input a value for 1 time
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
            this.price = price;
    }
}