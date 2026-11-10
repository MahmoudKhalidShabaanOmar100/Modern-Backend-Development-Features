/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingsumoftwointegernumbers;

/**
 *
 * @author moka
 */
import java.util.Scanner;
public class DisplayingSumOfTwoIntegerNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Integer Number Is = ");
        int fristIntegerNumber = input.nextInt();
        System.out.println("The Frist Integer Number Is = "+fristIntegerNumber);
        System.out.print("Please Enter The Second Integer Number Is = ");
        int secondIntegerNumber = input.nextInt();
        System.out.println("The Second Integer Number Is = "+secondIntegerNumber);
        int sumOfTwoIntegerNumbers = fristIntegerNumber + secondIntegerNumber;
        System.out.print("The Sum Of The Two Integer Numbers Is = "+sumOfTwoIntegerNumbers);
    }
}