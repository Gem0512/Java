/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;

public class dien_chu_so {
     public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int t=scan.nextInt();
      while(t-->0){
          String a=scan.next();
          String b=scan.next();
          System.out.println(+load(a,b));
      }
        }
    public static int load(String x,String s){
        char[] a=x.toCharArray();
        char[] b=s.toCharArray();
        int dem = 0;
        for (int i = 0; i < x.length(); i++) {
            if (a[i] != b[i]) {
                if (a[i] == '?') dem += ('9' - b[i]) * abcd(x, i);
                else {
                    if (a[i] < b[i]) return dem;
            
                    if (a[i] > b[i]) return dem + abcd(x, i);
                }
            }
        }
        return dem;
    }
    public static int abcd(String s,int n){
        char[] a=s.toCharArray();
        int kt = 1;
        for (int i = n + 1; i < s.length(); i++) if (a[i] == '?') kt *= 10;
        return kt;
    }
}