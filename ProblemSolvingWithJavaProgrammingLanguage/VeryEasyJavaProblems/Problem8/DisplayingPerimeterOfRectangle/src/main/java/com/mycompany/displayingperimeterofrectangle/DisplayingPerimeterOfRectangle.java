/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingperimeterofrectangle;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/cMKLM7ExBd3TFJwPA
public class DisplayingPerimeterOfRectangle{
    public static int perimeterOfRectangle(int rectangleLength , int rectangleWidth){
        System.out.println("The Rectangle Length Is = "+rectangleLength);
        System.out.println("The Rectangle Width Is = "+rectangleWidth);
        int rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
        System.out.print("The Rectangle Perimeter Is = ");
        return rectanglePerimeter;
    }
    public static void main(String[] args){
        int result = perimeterOfRectangle(6 , 7);
        System.out.print(result);
    }
}