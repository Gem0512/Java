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
public class khai_bao_lop_hcn {
    
private static int check(double n){
    //flag = 1 => số nguyên
    //flag = 0 => số thực

    int flag = 1;
    if (Math.ceil(n) != Math.floor(n)) flag = 0;
    return flag;
}
    
    
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
String s=sc.next();
        if(check(a)==1 &&check(b)==1&&a>0&&b>0){
            String firstLetter = s.substring(0, 1);
  
    String remainingLetters = s.substring(1, s.length());
 
 
    firstLetter = firstLetter.toUpperCase();
    remainingLetters=remainingLetters.toLowerCase();
  
    s = firstLetter + remainingLetters;
    long x=(int)(2*a+2*b);
    long y=(int)(a*b);
            System.out.println(x+" "+y+" "+s);
        }
        else{
            System.out.println("INVALID");
        }


    }
    
}
