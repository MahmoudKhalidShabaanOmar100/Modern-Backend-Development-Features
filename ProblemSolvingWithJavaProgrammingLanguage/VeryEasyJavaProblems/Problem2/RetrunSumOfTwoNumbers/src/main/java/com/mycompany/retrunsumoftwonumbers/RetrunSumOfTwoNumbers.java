/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retrunsumoftwonumbers;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/8Ty2vq2YtcBp6CFc8
public class RetrunSumOfTwoNumbers{
    public static int returnSum(int fristNumber , int secondNumber){
        System.out.println("The Frist Number Is = "+fristNumber);
        System.out.println("The Second Number Is = "+secondNumber);
        int sumOfNumbers = fristNumber + secondNumber;
        System.out.print("The Sum Of The Two Numbers Is = ");
        return sumOfNumbers;
    }
    public static void main(String[] args){
        int result = returnSum(3 , 2);
        System.out.print(result);
    }
}