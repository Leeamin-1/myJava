import java.util.Scanner;

public class Code6_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num1, num2;

        while (true) {
            System.out.print("숫자 1 ==> ");
            num1 = s.nextInt();
            System.out.print("숫자2 ==> ");
            num2 = s.nextInt();

            hap = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + hap);
        }
    }
}
