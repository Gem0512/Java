/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author 84372
 */
public class phan_so {
    public static long GCD(long a, long b) {
        if (b==0) return a;
   return GCD(b,a%b);
    }
    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);

                     long a=sc.nextLong();
                     long b=sc.nextLong();
                     long c=sc.nextLong();
                     long d=sc.nextLong();
                   long x=a*d+b*c;
                   long y=b*d;
                     if(x==0) System.out.println(0);
                     else if(x==y)System.out.println("1/1");
                     else{
                          long k= GCD(x,y);
                     
                     System.out.println(x/k+"/"+y/k);
                     }
                     
                     
    }
    
}
