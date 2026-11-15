/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retryorstop;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/ccv2_a1961ffda5157d645f670f7c
public class RetryOrStop{
    public static boolean checkRetryOrStop(boolean failed , int attempts , int limits){
        System.out.println("Failed Is : "+failed);
        System.out.println("The Total Attempts Is = "+attempts);
        System.out.println("The Total Limits Is = "+limits);
        System.out.print("Check Retry , Or Stop Is : ");
        if((failed == true) && (attempts < limits)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean result = checkRetryOrStop(true , 2 , 3);
        System.out.println(result);
    }
}