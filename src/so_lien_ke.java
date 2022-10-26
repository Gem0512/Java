import java.util.Scanner;

public class so_lien_ke {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){

            long n=sc.nextLong();
            int ok=1;
            while(n/10!=0){
                long x=n%10;
                n=n/10;
            
                if(n%10-x!=1&&n%10-x!=-1){
                    ok=0;
                    break;
                }
            }
           if(ok==0) System.out.println("NO");
           else System.out.println("YES");
           t--;
        }

    }
}