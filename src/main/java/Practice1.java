public class Practice1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            int star;

            if (i <= 4) {
                star = i;
            } else {
                star = 8 - i;
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}