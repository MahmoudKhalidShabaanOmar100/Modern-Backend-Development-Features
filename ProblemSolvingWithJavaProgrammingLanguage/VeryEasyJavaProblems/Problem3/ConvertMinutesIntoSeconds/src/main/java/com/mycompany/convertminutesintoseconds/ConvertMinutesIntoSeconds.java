/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertminutesintoseconds;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/2t8JDxF7wLrg7yJ5E
public class ConvertMinutesIntoSeconds{
    public static int MinutesIntoSeconds(int totalMinutes){
        System.out.println("The Total Minutes Is = "+totalMinutes);
        int minsToSecs = totalMinutes * 60;
        System.out.print("The Total Seconds Is = ");
        return minsToSecs;
    }
    public static void main(String[] args){
        int totalSeconds = MinutesIntoSeconds(2);
        System.out.print(totalSeconds);
    }
}