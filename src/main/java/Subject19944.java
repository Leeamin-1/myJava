import java.util.Scanner;

public class Subject19944 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if (M == 1 || M == 2) {
            System.out.println("NEWBIE!");
        }  else if (M <= N) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}
