import java.util.Scanner;

public class so_lien_ke {

    public static long check(long n) {
        int ok=1;
        while(n/10!=0){
            long x=n%10;
            n=n/10;

            if(n%10-x!=2&&n%10-x!=-2){
                ok=0;
                break;
            }
        }
        if(ok==0) return 0;
        else return 1;
    }
    public static long tong(long n) {
       long sum=0;
        while(n!=0){
            long x=n%10;
            n=n/10;
            sum=sum+x;

        }
        if(sum%10==0) return 1;
        else return 0;
//        return sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){

            long n=sc.nextLong();
//            System.out.println(tong(n));

            if(check(n)==1) {
                if(tong(n)==1)     System.out.println("YES");
                else     System.out.println("NO");
            }
            else    System.out.println("NO");
            t--;
        }

    }
}