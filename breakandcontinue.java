public class breakandcontinue {
    public static void main(String[] args){
        
        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++){
            if(i == 4){
                break;
                //continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        for(int i = 0; i < 10; i++){
            if(i == 4){

                continue;
            }
            System.out.print(i + " ");
        }
    }
}