package tests;

import java.util.Arrays;
import java.util.Scanner;

public class RevesPuzzle {
 
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    long[] soln=new long[(int) (x+1)];
    long[] min=new long[(int)x+1];
    soln[0]=0;
    soln[1]=1;
    min[0]=0;
    min[1]=0;
    long[] soln2 = new long[(int) x];
    for(long i=2;i<=x;i++) {
      soln2=new long[(int) i];
      for(long j=1;j<i;j++) {
     
        soln2[(int) j]=(long) (2*soln[(int) j]+Math.pow(2, i-j)-1);
        if(j>=1&&soln2[(int) j]<=soln2[(int) j-1]) {
          min[(int)i]=j;
        }
        
      }
       Arrays.sort(soln2);
       soln[(int) i]=soln2[1];
    }
    min[2]=1;
    min[3]=1;
    //Output is in following format:
    //Number of Discs   Minimum Number of Moves Needed    Optimal k Value
    for(int i=1;i<x+1;i++) {
      System.out.print(i+" ");
      System.out.print(soln[(int) i]+" ");
      System.out.print(min[(int) i]+" ");
      System.out.println();
    }
    
  }
}   
