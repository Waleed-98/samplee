/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

public class bb {
   
public int cadence,gear,speed;

    public bb(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }
       void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
}
class MountainBike extends bb{
        
public int seatHeight;

    public MountainBike(int seatHeight,int cadence, int gear, int speed) {
        super(cadence, gear, speed);
        this.seatHeight=seatHeight;

    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

}
