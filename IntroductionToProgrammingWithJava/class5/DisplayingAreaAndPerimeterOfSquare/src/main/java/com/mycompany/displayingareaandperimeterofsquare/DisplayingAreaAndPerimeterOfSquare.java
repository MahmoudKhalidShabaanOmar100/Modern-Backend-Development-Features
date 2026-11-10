/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingareaandperimeterofsquare;

/**
 *
 * @author moka
 */
import java.util.Scanner;
public class DisplayingAreaAndPerimeterOfSquare{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Square Length Is = ");
        int squareLength = input.nextInt();
        System.out.println("The Square Length Is = "+squareLength);
        int squareArea = squareLength * squareLength;
        System.out.println("The Square Area Is = "+squareArea);
        int squarePerimeter = 4 *squareLength;
        System.out.println("The Square Perimeter Is = "+squarePerimeter);
    }
}