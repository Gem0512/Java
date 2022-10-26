import java.util.Scanner;

public class tong_giai_thua {

    // Ham Kiem tra n co phai la so nguyen to hay khong
    public static long Fibonacci(int n) {
        long sum=1;
        for(int i=1;i<=n;i++)
            sum=sum*i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


            int n=sc.nextInt();
            long dem=0;
            for(int i=1;i<=n;i++){
                dem=dem+Fibonacci(i);
            }

            System.out.println(dem);


    }
}