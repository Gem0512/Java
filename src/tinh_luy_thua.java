import java.util.Scanner;

public class tinh_luy_thua {

    public static long tong(long a,long b) {
        int mod = 1000000007;
        long n=1;
        while(b>1) {
            if(b%2==0) {
                a*=a;
                a%=mod;
                b/=2;
            }
            else {
                n*=a;
                n%=mod;
                b--;
            }
        }
        if(b==0) return 1;
        else  return (long)a*n%mod;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){

            long n=sc.nextLong();
            long m=sc.nextLong();

        if( n==0 &&m==0) break;
        else System.out.println(tong(n,m));

        }

    }
}