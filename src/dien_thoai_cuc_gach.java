package codeptit;

import java.util.*;

/**
 *
 * @author khanh
 */
public class dien_thoai_cuc_gach {
    public static char check(char s){
        if(s=='A' || s=='B' || s=='C'){
            return '2';
        }
        if(s=='D' || s=='E' || s=='F'){
            return '3';
        }
        if(s=='G' || s=='H' || s=='I'){
            return '4';
        }
        if(s=='J' || s=='K' || s=='L'){
            return '5';
        }
        if(s=='M' || s=='N' || s=='O'){
            return '6';
        }
        if(s=='P' || s=='Q' || s=='R' || s=='S'){
            return '7';
        }
        if(s=='T' || s=='U' || s=='V'){
            return '8';
        }
        if(s=='W' || s=='X' || s=='Y' || s=='Z'){
            return '9';
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            int l=s.length();
            char[] aa=new char[l];
            for(int i=0;i<l;i++){
                aa[i]=(check(Character.toUpperCase(s.charAt(i))));
            }
            int cc=1;
            for(int i=0;i<(l/2);i++){
                if(aa[i]!=aa[l-i-1]){
                    cc=0;
                    break;
                }
            }
            System.out.println(cc==1?"YES":"NO");
        }
    }
}