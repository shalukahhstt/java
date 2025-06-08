public class Circle extends Shape{

    double radius;

    Circle(double radius){ // ABSTRACT METHOD
        this.radius = radius;
    }

    @Override
    double area(){ // CONCRETE METHOD
        return Math.PI * radius * radius;
    }
}
