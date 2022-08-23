import java.util.Scanner;

public class phan_tich_thưa_so_nguyen_to {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long  t=sc.nextInt();
        int k=1;
        long dem = 0;
        while(k<=t)
        {
            long  n=sc.nextInt();

            for(long i = 2; i <= n; i++){

                while(n % i == 0){
                  dem=dem+i;
                    n /= i;
                }

            }

            k=k+1;
        }
        System.out.println(dem);


    }
}


