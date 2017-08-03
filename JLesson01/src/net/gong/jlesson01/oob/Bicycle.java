package net.gong.jlesson01.oob;

/**
 * Created by gong on 2017/8/3.
 */
public class Bicycle {

    static class MountainBicycle extends Bicycle {

    }

    static class  RoadBicycle extends Bicycle {

    }

    static class TandemBicycle extends Bicycle {

    }

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    /**
     * 改变踩踏板速度
     * @param newValue
     */
    void changeCadence(int newValue) {
        cadence = newValue;
    }

    /**
     * 改变档位
     * @param newValue
     */
    void changeGear(int newValue) {
        gear = newValue;
    }

    /**
     * 加速
     * @param increment
     */
    void speedUp(int increment) {
        speed = speed + increment;
    }

    /**
     * 使用刹车
     * @param decrement
     */
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    /**
     * 打印当前状态
     */
    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
