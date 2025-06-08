public class Main {
    public static void main(String[] args) {

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                                     Add custom behavior without having to create a new class.
        //                                     Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){ // rather than creating a new class for scooby we can make a anonymous class like this 
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
