public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawak hawk = new Hawak();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}