/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.converthoursintoseconds;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/DmFnzAQzWhyRWdKPi
public class ConvertHoursIntoSeconds{
    public static int hoursIntoSeconds(int totalHours){
        System.out.println("The Total Hours Is = "+totalHours);
        int totalSeconds = totalHours * 60 * 60;
        System.out.print("The Total Seconds Is = ");
        return totalSeconds;
    }
    public static void main(String[] args){
        int result = hoursIntoSeconds(24);
        System.out.print(result);
    }
}