public class Main{
    public static void main(String[] args) {
        //MyRunnable myRunnable = new MyRunnable(); we can also use new MyRunnable inside Thread(new MyRunnable())
        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));
        
        System.out.println("...GAME STARTS...\n");

        thread1.start();
        thread2.start();

        // To wait for main threads to end we need to use thread.join()
        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("\n...GAME ENDS...\n");
    }
}