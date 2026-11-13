/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.namethatplaylist;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/ccv2_cd68bfdcfa174dbeb6e3cd5a
public class NameThatPlaylist{
    public static String playListName(String mood){
        System.out.println("The Mood Is : "+mood);
        String displayingPlaylistName = "\"" + mood + " Mix" + "\"";
        System.out.print("The Playlist Name Is : ");
        return displayingPlaylistName;
    }
    public static void main(String[] args){
        String result = playListName("Late Night");
        System.out.print(result);
    }
}