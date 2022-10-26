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
public class chia_tam_giac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            for(int i=1;i<=h;i++){
                double k=h*Math.sqrt((double)i/n);
                if(k<h){
                    System.out.printf("%.6f",k);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
