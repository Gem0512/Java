import java.util.Scanner;

public class uoc_so_chia_het_cho3 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long  t=sc.nextInt();
        int k=1;
        while(k<=t)
        {
            long  n=sc.nextInt();
            long dem=0;
           for(long i=1;i<=Math.sqrt(n);i++){
               if(n%i==0){
                   if(i%2==0) dem++;
                   if((n/i)%2==0&&n/i!=i) dem++;
               }

           }

            System.out.println(dem);
            k=k+1;
        }



    }
}


