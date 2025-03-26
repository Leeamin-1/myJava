import java.util.Scanner;

public class Exam_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요: ");
        int a = sc.nextInt();

        System.out.println("숫자를 입력해 주세요: ");
        int b = sc.nextInt();

        double result = (double) a / b;
        System.out.println(a + " / " + b + " = " + result);

        sc.close();


    }
}
