import java.util.Scanner;

public class Subject10950 {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        int a = s.nextInt();

        for ( int i = 0; i < a; i++){
            int b = s.nextInt();
            int c = s.nextInt();

            System.out.println(b + c);
        }



      s.close();
    }
}
