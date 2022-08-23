import java.util.Scanner;

public class uoc_so_nguyen_to_lon_nhat {

    // Ham Kiem tra n co phai la so nguyen to hay khong
    public static boolean ngto(long n) {

        if (n < 2) {
            return false;
        }

        long squareRoot = (long) Math.sqrt(n);
        for (long i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
           long i=2;
           while(i<=n/i){
               if(n%i==0) n/=i;
               else i++;
           }
            System.out.println(n);

            t--;
        }

    }
}