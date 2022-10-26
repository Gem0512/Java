import java.util.Scanner;

public class phan_tich_thưa_so_nguyen_to {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long  t=sc.nextInt();
        int k=1;
        while(k<=t)
        {
            long  n=sc.nextInt();
            System.out.print("Test "+k+": ");
            for(int i = 2; i <= n; i++){
                int dem = 0;
                while(n % i == 0){
                    ++dem;
                    n /= i;
                }
                if(dem!=0) System.out.print(i+"("+dem+")"+" ");
            }
            System.out.println();
            k=k+1;
        }



    }
}
