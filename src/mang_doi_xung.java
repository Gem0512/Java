import java.util.Scanner;

public class mang_doi_xung {

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

            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
//            System.out.println(tong(n));
            int ok=1;
            for(int i=0;i<n/2;i++){
                if(a[i]!=a[n-i-1]){
                    ok=0;
                    break;
                }
            }


            if(ok==1)     System.out.println("YES");
            else     System.out.println("NO");

            t--;
        }

    }
}


