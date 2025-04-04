import java.util.Scanner;

public class Code5_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        if (num % 2 == 0)
            System.out.println("짝수");
        else
            System.out.println("홀수");

        s.close();

    }
}
