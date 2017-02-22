/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author ryanmcgovern
 */
public class Flower {
    private String mFlowerName;
    private double mGetHeight;
    private int mNumberOfPedals;
    private boolean mHasThorns;
    public Flower(String flowerName, double height, int pedals, boolean thorns) {
        mFlowerName = flowerName;
        mGetHeight = height;
        mNumberOfPedals = pedals;
        mHasThorns = thorns;
    }

    public double getHeight() {
        return mGetHeight;
    }
    
    public int numberOfPedals() {
        return mNumberOfPedals;
    }
    
    public boolean hasThorns() {
        return mHasThorns;
    }
    
    public String toString(){
        return mFlowerName;
    }
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 30, 9, true);
        System.out.println("This flower is a " + rose.toString());
        System.out.println("This flower is " + rose.getHeight() + " cm");
        System.out.println("This flower has " + rose.numberOfPedals() + " pedals");
        if (rose.hasThorns()) {
            System.out.println("This flower has thorns.");
        }
        else {
            System.out.println("This flower does not have thorns.");
        }
    }
    
}
