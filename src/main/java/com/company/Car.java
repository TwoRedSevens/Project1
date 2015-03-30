package com.company;

/**
 * Created by MDB on 30/03/2015.
 */
public class Car {

    //State
    public int speed;
    private int gear;

    //behaviour

    public Car() {
    }

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    /** Speed @return   */
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += turboBoost()+increment;
    }

    private int turboBoost(){
        return 1000;
    }
}
