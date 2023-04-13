public class Main {
    public static void main(String[] args) {
        DVD dvd = new DVD("first birthday", 2006 );
        dvd.movement("right");
        dvd.speedOfSpin(10, 50);
        Wheel wheel = new Wheel("right");
        wheel.movement("left");
        wheel.speedOfSpin(10, 700);
        Tornado tornado = new Tornado("Mary", 2017);
        tornado.movement("right");
        tornado.speedOfSpin(10, 8000);
    }
}