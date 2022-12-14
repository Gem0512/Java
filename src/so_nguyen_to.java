import java.util.Scanner;

public class so_nguyen_to {

    // Ham Kiem tra n co phai la so nguyen to hay khong
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
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
            int n=sc.nextInt();

            if(isPrime(n)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }

    }
}