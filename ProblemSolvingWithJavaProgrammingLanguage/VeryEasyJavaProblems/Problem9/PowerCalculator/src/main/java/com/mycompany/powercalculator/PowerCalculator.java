/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.powercalculator;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/6MTtawFBLqDRSqiSf
public class PowerCalculator{
    public static int displayingPower(int voltage , int current){
        System.out.println("The Total Voltage Is = "+voltage);
        System.out.println("The Total Current Is = "+current);
        int totalPower = voltage * current;
        System.out.print("The Total Power Is = ");
        return totalPower;
    }
    public static void main(String[] args){
        int result = displayingPower(230 , 10);
        System.out.print(result);
    }
}