package exam01 ;

public class HouseRabbit extends Rabbit {

    String owner;

    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }

    @Override
    void move(int x, int y) {
        System.out.println("난 재정의된 함수다.!");
    }
}

