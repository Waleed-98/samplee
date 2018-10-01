/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;
import java.util.*;
public class Bicycle {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your bike information");
        System.out.println("seat height");int h=in.nextInt();
        System.out.println("cadence");int c=in.nextInt();
       System.out.println("gear");int g=in.nextInt();
               System.out.println("speead");int s=in.nextInt();
        MountainBike m1=new MountainBike(h,c,g,s);
        m1.speedUp(120);
       m1.applyBrakes(100);
        m1.setSeatHeight(90);
                System.out.println( m1.seatHeight);
              
    }
    
}
