import java.util.Scanner;
public class Exam_01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하시오: ");
        int a = sc.nextInt();

        System.out.print("숫자를 입력하시오: ");
        int b = sc.nextInt();

        double result =(double)a / b;

        System.out.println(a + " / " + b + " = " + result);
        sc.close();
    }
}