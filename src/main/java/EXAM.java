import java.util.Scanner;

public class EXAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b, result;
        String c, d;

        a = sc.nextLine();
        b = sc.nextLine();

        c = a + b;
        d = c.toLowerCase();

        result = d.replaceAll(" ","");
        result = (a+b).toLowerCase().replaceAll(" ","");

        System.out.println(result);
        sc.close();
    }
}
