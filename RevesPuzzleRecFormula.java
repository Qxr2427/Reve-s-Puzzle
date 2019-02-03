package tests;

import java.util.Scanner;

public class RevesPuzzleRecFormula {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int[] dp=new int[x+1];
    dp[1]=1;
    
    for(int i=2;i<=x;i++) {
      dp[i]=(int) (2*dp[i-(int) Math.floor((-1+Math.sqrt(8*i+1))/2.0)]+Math.pow(2, i-(i-(int) Math.floor((-1+Math.sqrt(8*i+1))/2.0))))-1;
    }
    for(int i=1;i<=x;i++) {
      System.out.println(i+" "+dp[i]);
    }
  }
}
