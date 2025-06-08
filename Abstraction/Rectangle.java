public class Rectangle extends Shape{

    double breadth;
    double width;

    Rectangle(double breadth, double width){
        this.breadth = breadth;
        this.width = width;
    }

    @Override
    double area(){
        return width*breadth;
    }
    
}
