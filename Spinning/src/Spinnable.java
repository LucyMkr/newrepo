public interface Spinnable {
    default void movement(String side) {
        if (side == "right") {
            int spinAmount = 0;
            spinAmount++;
            System.out.println("Object has spun right " + spinAmount + " times");
        } else if (side == "left"){
            int spinAmount = 0;
            spinAmount++;
            System.out.println("Object has spun left " + spinAmount + " times");
        } else {
            System.exit(1);
        }
    }

    default void speedOfSpin(int secOfFullSpin, int lengthInCm) {
        int speed = lengthInCm / secOfFullSpin;
        System.out.println("Speed os spin is " + speed + " cm/sec");
    }
}