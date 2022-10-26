/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author 84372
 */
public class chia_het_cho_11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t>0){
        String s=sc.next();    
        int n=s.length();
        int a=0;
        for(int i=0;i<n;i++){
            a=a*10 + s.charAt(i)-'0';
            a=a%11;
        }
        if(a==0) System.out.println(1);
        else System.out.println(0);
        t--;
   }
    }
}
