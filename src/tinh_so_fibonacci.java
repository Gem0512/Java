import java.util.Scanner;

public class tinh_so_fibonacci {

    // Ham Kiem tra n co phai la so nguyen to hay khong
    public static long Fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        long i;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextInt();

                System.out.println(Fibonacci(n));

            t--;
        }

    }
}