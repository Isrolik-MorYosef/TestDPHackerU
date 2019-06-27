/**
 * Created by Isrolik morYossef on 6/27/2019 | 12:44 PM.
 */
public class CarImplements implements Car {
    private int speed = 0;

    @Override
    public void startDrive() {
        System.out.println("start drive");
    }

    @Override
    public void finishDrive() {
        System.out.println("finish drive");
    }

    @Override
    public void addSpeed() {
        speed++;
        System.out.println("add speed");
    }

    @Override
    public void downSpeed() {
        speed--;
        System.out.println("down speed");

    }

    @Override
    public void slow() {
        System.out.println("car slow");

    }

    @Override
    public void turnRhigt() {
        System.out.println("car turn right");
    }

    @Override
    public void turnLeft() {
        System.out.println("car turn left");
    }

    @Override
    public void showGas() {
        System.out.println("show gas");

    }

    @Override
    public void showLocation() {
        System.out.println("show Location");
    }
}
