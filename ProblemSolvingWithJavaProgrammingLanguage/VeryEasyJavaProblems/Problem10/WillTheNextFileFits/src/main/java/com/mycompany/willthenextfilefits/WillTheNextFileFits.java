/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.willthenextfilefits;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/ccv2_f6b7938b958a87bec0c99721
public class WillTheNextFileFits{
    public static boolean checkNextFileFits(int fileCapacity , int fileUsed , int fileSize){
        System.out.println("The File Capacity Is = "+fileCapacity);
        System.out.println("The File Used Is = "+fileUsed);
        System.out.println("The File Size Is = "+fileSize);
        int sumOfFileUsedAndFileSize = fileUsed + fileSize;
        System.out.println("The Total Of The File Used , And File Size Is = "+sumOfFileUsedAndFileSize);
        System.out.print("Check The File Fit Is : ");
        if(fileCapacity > sumOfFileUsedAndFileSize){
            return true;
        }
        else if(fileCapacity == sumOfFileUsedAndFileSize){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean result = checkNextFileFits(100 , 70 , 20);
        System.out.println(result);
    }
}