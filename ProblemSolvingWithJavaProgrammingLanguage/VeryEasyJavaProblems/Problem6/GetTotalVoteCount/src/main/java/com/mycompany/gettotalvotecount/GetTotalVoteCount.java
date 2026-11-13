/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gettotalvotecount;

/**
 *
 * @author moka
 */
// https://edabit.com/challenge/XJxu5LCnqN9K8SXm5
public class GetTotalVoteCount{
    public static int differenceBetweenUpVotesAndDownVotes(int upVotes , int downVotes){
        System.out.println("The Total Up Votes Is = "+upVotes);
        System.out.println("The Total Down Votes Is = "+downVotes);
        int totalVotes = upVotes - downVotes;
        System.out.print("The Total Votes Count Is = ");
        return totalVotes;
    }
    public static void main(String[] args){
        int result = differenceBetweenUpVotesAndDownVotes(13 , 0);
        System.out.println(result);
    }
}