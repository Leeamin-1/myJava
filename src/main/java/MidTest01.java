public class MidTest01 {

    public static void main(String[] args) {

        // 총 4줄을 출력해야 하므로 i는 0부터 3까지 반복
        for (int i = 0; i < 4; i++) {


            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" "); // 가운데 정렬을 위해 줄바꿈 없이 공백을 한 칸 출력
            }                         // 공백 개수는 줄 번호에 따라 (3 - i)개가 된다

            // 별 출력: 각 줄에 출력될 별의 개수는 (2 * i + 1)개이다.
            // i=0 → 1개, i=1 → 3개, i=2 → 5개, i=3 → 7개
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*"); // 별 하나 출력 (줄 바꿈 없이)
            }

            // 줄 바꿈: 한 줄이 끝났으므로 다음 줄로 이동
            System.out.println();
        }
    }
}