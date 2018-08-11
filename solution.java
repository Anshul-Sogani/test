import java.util.*;
import java.io.*;
import java.lang.*;
class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int k=0;k<t;k++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a+b-1;
            for(int j =0 ;j>=n-1;j++ ){
                sum = sum +(int)(Math.pow(2,j));
                System.out.println(sum+" ");
            }
        }
        }
        
    }