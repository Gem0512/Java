import java.util.Scanner;

public class so_tam_phan {

    public static long tong(long n) {
        long sum=0;
        while(n!=0){
            long x=n%10;
            n=n/10;
            if( x!=0 && x!=1 && x!=2) return 0;

        }
       return 1;
//        return sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){

            long n=sc.nextLong();
//            System.out.println(tong(n));


                if(tong(n)==1)     System.out.println("YES");
                else     System.out.println("NO");

            t--;
        }

    }
}