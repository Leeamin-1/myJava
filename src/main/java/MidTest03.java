public class MidTest03 {

    public static void main(String[] args) {

        // 합계를 저장할 변수 sum을 0으로 초기화
        int sum = 0;

        // 반복문을 통해 100부터 300까지의 숫자를 하나씩 검사
        for (int i = 100; i <= 300; i++) {

            // 현재 숫자 i가 5의 배수이거나 7의 배수이면 조건에 해당한다.
            if (i % 5 == 0 || i % 7 == 0) {

                // 조건을 만족하는 숫자 i를 sum에 누적하여 더해준다.
                sum += i;
            }
        }

        // 반복이 끝난 후, 최종 합계를 출력
        System.out.println("합계: " + sum);
    }
}
