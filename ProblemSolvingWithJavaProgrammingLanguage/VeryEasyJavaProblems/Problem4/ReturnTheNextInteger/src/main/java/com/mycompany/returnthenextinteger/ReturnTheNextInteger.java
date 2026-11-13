/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returnthenextinteger;

/**
 *
 * @author moka
 */
// ReturnTheNextIntegerNumberFromTheIntegerNumberPassed
public class ReturnTheNextInteger{
    public static int displayingNextIntNum(int integerNumber){
        System.out.println("The Passed Integer Number Is = "+integerNumber);
        int nextIntegerNumber = integerNumber + 1;
        System.out.print("The Next Integer Number From The Passed Integer Number Is = ");
        return nextIntegerNumber;
    }
    public static void main(String[] args){
        int result = displayingNextIntNum(-3);
        System.out.print(result);
    }
}