// 실행 클래스: 프로그램의 진입점이며 문제에서 요구한 이름은 Exam04입니다.
public class MidTest04 {

    // main 메서드: 자바 프로그램의 시작 지점입니다.
    public static void main(String[] args) {

        // Fish 타입으로 GoldFish 객체를 생성합니다 (다형성).
        Fish myFish = new GoldFish();

        // swim 메서드를 호출합니다. GoldFish 클래스에서 오버라이딩된 메서드가 실행됩니다.
        myFish.swim();  // 출력: 헤엄치고 있습니다.
    }
}

// 추상 클래스 Fish: 기본 틀을 제공하며, swim 메서드는 서브 클래스에서 구현해야 합니다.
abstract class Fish {
    abstract void swim(); // 추상 메서드: 구현은 자식 클래스에게 위임
}

// GoldFish 클래스: Fish 클래스를 상속받아 swim 메서드를 구체적으로 구현합니다.
class GoldFish extends Fish {

    // @Override 애너테이션은 상속받은 메서드를 재정의한다는 의미입니다.
    @Override
    void swim() {
        System.out.println("헤엄치고 있습니다."); // 요구된 출력문
    }
}