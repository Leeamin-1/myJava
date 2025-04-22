class Rabit01 {
    String shape;
    int xPos;
    int yPos;

    Rabit01() {
        shape = "토끼";
    }

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }

}

public class Code 7_10 {
    public static void main(String[]args) {
        Rabit01 rabit01 = new Rabit01();

        System.out.print("토끼 객체의 기본 모양은 [%s] 입니다.", rabit01.shape);
    }
}