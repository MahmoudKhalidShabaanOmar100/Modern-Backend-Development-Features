/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acceptingdifferentinputsfromtheuser;

/**
 *
 * @author moka
 */
// Import Scanner Class From The java Package From The util Package...
import java.util.Scanner;
public class AcceptingDifferentInputsFromTheUser{
    public static void main(String[] args){
        // It Is Mainly Used To Create A Scanner To Get Inputs From The User...
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Integer Number Is = ");
        int integerNumber = input.nextInt(); // Integer Number...
        System.out.println("Integer Number Is = "+integerNumber);
        System.out.print("Please Enter The Floating Number Is = ");
        float floatNumber = input.nextFloat(); // Floating Point Number...
        System.out.println("Float Number Is = "+floatNumber);
        System.out.print("Please Enter The Double Number Is = ");
        double doubleNumber = input.nextDouble(); // Double Precision Floating Point Numbers...
        System.out.println("The Double Number Is = "+doubleNumber);
        System.out.print("Please Enter Character Is : ");
        char character = input.next().charAt(0); // Character Only...
        System.out.println("The Character Is : "+character);
        System.out.print("Please Enter The String Sentence Is : ");
        String stringSentence = input.next(); // String Sentence Without Spaces....
        System.out.println("The String Sentence Is : "+stringSentence);
        System.out.print("Please Enter A Truthy Boolean Value Is : ");
        boolean truthyValue = input.nextBoolean();
        System.out.println("The Truthy Value Is : "+truthyValue);
        System.out.print("Please Enter The Falsy Value Is : ");
        boolean falsyValue = input.nextBoolean();
        System.out.println("The Falsy Boolean Value Is : "+falsyValue);
    }
}