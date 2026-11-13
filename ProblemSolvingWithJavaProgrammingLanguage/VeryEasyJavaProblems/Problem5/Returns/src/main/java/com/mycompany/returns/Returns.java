/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returns;

/**
 *
 * @author moka
 */
public class Returns {
    public static int nextIntegerNumber(int integerNumber){
        System.out.println("The Integer Number Is = "+integerNumber);
        int IncrementedIntegerNumberByOne = integerNumber + 1;
        System.out.print("The Next Integer Number From The Integer Number Passed is = ");
        return IncrementedIntegerNumberByOne;
    }
    public static void main(String[] args){
        int nextIntNum = nextIntegerNumber(-3);
        System.out.print(nextIntNum);
    }
}
