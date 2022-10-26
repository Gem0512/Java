package codeptit;

import java.util.*;
/**
 *
 * @author khanh
 */
public class bo_sung_day_so {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[10000];
        int max=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            a[x]=1;
            if(x>max){
                max=x;
            }
        }
        int cc=1;
        for(int i=1;i<max;i++){
            if(a[i]==0){
                System.out.println(i);
                cc=0;
            }
        }
        if(cc==1){
            System.out.println("Excellent!");
        }
    }
}