interface Rabbit {
    abstract void sleep();
}

class HouseRabbit implements Rabbit {
    public void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit implements Rabbit {
    public void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code8_9 {
    public static void main(String[] args) {
        HouseRabbit houseRabbit = new HouseRabbit();
        MountainRabbit mountainRabbit = new MountainRabbit();

        houseRabbit.sleep();
        mountainRabbit.sleep();



    }
}