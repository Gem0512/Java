import java.util.Scanner;

public class bcnn_n_so_dau {
    public static long gcd(long a,long b) {
        long tmp;
        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static long lcm(long a,long b) {
        return (a*b)/gcd(a,b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            long n=sc.nextLong();
            long temp=1;
            for (long i=1;i<=n;i++) {
                temp=lcm(temp,i);
            }
            System.out.println(temp);
            t--;
        }

    }
}
