/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import static java.lang.Math.sqrt;
import java.util.*;

/**
 *
 * @author 84372
 */
public class khai_bao_lop_poin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double d=sc.nextDouble();
        double h= sqrt((a-c)*(a-c)+(b-d)*(b-d));
           System.out.format("%.4f", h); 
            System.out.println();
        }
    }
}
