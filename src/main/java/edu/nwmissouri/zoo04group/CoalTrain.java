/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.util.Scanner;

/**
 * CoalTrain class derived from abstract Vehicle class 
 * @author Nithin Reddy Kumbham
 */
public class CoalTrain extends Vehicle{
    
    public CoalTrain(String name){
        super(name);
    }
    
    public String getname(String name){
        String name1 = name;
        return name1;
    }
    
    @Override
    public void location(){
        System.out.println("you can track me by using GPRS");
    }
    
    public void runType(){
        System.out.println("I run by using coal");
    }
    
    public VehicleColor getvehicleColour(){
        VehicleColor colour = VehicleColor.GREY;
        return colour;
    }
    
    public void purpose(){
        System.out.println("You can use me to roam in the zoo watching all the animals");
    }
    
    public void speed(){
        System.out.println("I travel slowly and my speed is 10kmph");
    }
    
    public double cost(double distance,int count){
        double price = distance*count;
        return price;
    }
    
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of vehicle");
        String name = scan.next();
        CoalTrain vehicletrain = new CoalTrain(name);
        System.out.println("My good name is : "+vehicletrain.getname(name));
        vehicletrain.location();
        vehicletrain.runType();
        System.out.println("Vehicle colour is : "+vehicletrain.getvehicleColour());
        vehicletrain.purpose();
        vehicletrain.speed();
        System.out.println("Enter distance");
        double distance = scan.nextDouble();
        System.out.println("Enter number of passengers");
        int count = scan.nextInt();
        System.out.println("Cost to travel with me for "+count+" passengers and "+distance+" distance is : "+vehicletrain.cost(distance, count));
        
    }
}
