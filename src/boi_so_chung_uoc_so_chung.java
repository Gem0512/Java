import java.util.Scanner;

public class boi_so_chung_uoc_so_chung {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  t=sc.nextInt();
        while(t>0)
        {
            long  a=sc.nextInt();
            long  b=sc.nextInt();
            System.out.println( BSCNN(a,b)+" "+USCLN(a,b));
             t=t-1;
        }

        }
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }






}

