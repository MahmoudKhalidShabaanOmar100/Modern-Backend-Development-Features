/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.onemoreencore;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/ccv2_e3189c6be52304e622935181
public class OneMoreEncore{
    public static int totalEncore(int totalSongs){
        System.out.println("The Total Songs Is = "+totalSongs);
        if(totalSongs >= 0 && totalSongs <= 100){
//            int totalEncors = totalSongs + 1;
              int totalEncors = ++totalSongs;
            System.out.print("The Total Encors Is = ");
            return totalEncors;
        }
        else{
            System.out.print("Please Enter A Valid Total Number Of Songs From 0 To 100... , Because The Total Number Of Songs Is = ");
            return totalSongs;
        }
    }
    public static void main(String[] args){
        int result = totalEncore(0);
        System.out.println(result);
    }
}