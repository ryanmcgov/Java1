/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author ryanmcgovern
 */
public class Distance {
    private double mDistance;
    public Distance() {
        
    }
    
    public double distance(double x1, double x2, double y1, double y2) {
       mDistance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 -y1)));
       return mDistance;
    }
    
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        Distance howFar = new Distance();
        Scanner scan = new Scanner(System.in);
        
        x1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y1 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        double point = howFar.distance(x1, x2, y1, y2);
        System.out.println("This is the Distance " + point);
    }
}
