/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arethetwonumbersequal;

/**
 *
 * @author moka
 */
// 
public class AreTheTwoNumbersEqual{
    public static boolean checkEqualityBetweenNumbers(int fristNumber , int secondNumber){
        System.out.println("The Frist Number Is = "+fristNumber);
        System.out.println("The Second Number Is = "+secondNumber);
        System.out.print("Check The Equality Between The Two Integer Numbers Is : ");
        if(fristNumber == secondNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean checkEquality = checkEqualityBetweenNumbers(2 , 2);
        System.out.println(checkEquality);
    }
}