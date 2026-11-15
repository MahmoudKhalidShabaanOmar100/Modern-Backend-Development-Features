/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.makeitahashtag;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/ccv2_de9a82a092eadb1a5b178df4
public class MakeItAHashtag{
    public static String hashtagName(String userName){
        System.out.println("The User Name Is : "+userName);
        System.out.print("The Hashtag User Name Is : ");
        return "#" + userName;
    }
    public static void main(String[] args){
        String result = hashtagName("coding");
        System.out.print(result);
    }
}