/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingareaofrectangle;

/**
 *
 * @author moka
 */
import java.util.Scanner;
public class DisplayingAreaOfRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Rectangle Length Is = ");
        int rectangleLength = input.nextInt();
        System.out.println("The Rectangle Length Is = "+rectangleLength);
        System.out.print("Please Enter The Rectangle Width Is = ");
        int rectangleWidth = input.nextInt();
        System.out.println("The Rectangle Width Is = "+rectangleWidth);
        int rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("The Area Of The Rectangle Is = "+rectangleArea);
    }
}