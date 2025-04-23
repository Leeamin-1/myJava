public class test11 {
    public static void main(String[] args) {
        int hap = 0;

        for (int i = 100; i <= 300; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                hap += i;
            }
        }

        System.out.println("합계: " + hap);  // 디버깅용 문구 포함
    }
}

