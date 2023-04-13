public class Wheel implements Spinnable{
    String leftOrRight;
    Wheel (String leftOrRight){
        this.leftOrRight = setLeftOrRight(leftOrRight);
    }

    private String setLeftOrRight(String leftOrRight) {
        if (leftOrRight == "right" || leftOrRight == "left") {
            this.leftOrRight = leftOrRight;
        } else {
            System.exit(4);
        }
        return leftOrRight;
    }
}