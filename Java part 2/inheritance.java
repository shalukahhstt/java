public class inheritance {

    public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();

    System.out.println(dog.isAlive);
    System.out.println(cat.isAlive);

    dog.eat();
    cat.eat();
    
    dog.speak();
    cat.speak();
    
    }
}
