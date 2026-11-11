/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.howedabitworks;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/L7z5EW4MSoGBi6cXP
public class HowEdabitWorks{
    public static boolean returnTrue(boolean boolVal){
        System.out.println("The Boolean Value Is : "+boolVal);
        return true;
    }
    public static void main(String[] args){
        boolean result = returnTrue(true);
        System.out.println(result);
    }
}