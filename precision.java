
public class precision {
    public static void main(String[] args) {
        
        double price1 = 9.99;
        double price2 = 100.02;
        double price3 = -54.01;
        double price4 = 9999.99;

        // . decimal point
        System.out.printf("%.1f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.3f\n",price3);

        // + output aa plus if positive
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.2f\n",price3);
        
        // , comma grouping separator
        System.out.printf("%,.2f\n",price4);

        // ( negative numbers enclosed in ()
        System.out.printf("%(.2f\n",price2);
        System.out.printf("%(.2f\n",price3);

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("id: %04d\n", id1);
        System.out.printf("id: %04d\n", id2);
        System.out.printf("id: %04d\n", id3);
        System.out.printf("id: %04d\n", id4);


        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
        





    }
}
