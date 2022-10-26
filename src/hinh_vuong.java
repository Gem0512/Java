package codeptit;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author 84372
 */
public class hinh_vuong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int c1=sc.nextInt();
        int d1=sc.nextInt();
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        int c2=sc.nextInt();
        int d2=sc.nextInt();
        int a=Math.min(a1, a2);
        int aa=Math.max(c1, c2);
        int b=Math.min(b1, b2);
        int bb=Math.max(d1, d2);
        int za=Math.abs(aa-a);
        int zb=Math.abs(bb-b);
        if(za>zb){
            System.out.println(za*za);
        }
        else{
            System.out.println(zb*zb);
        }
    }
}