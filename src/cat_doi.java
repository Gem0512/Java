import java.util.Scanner;

public class cat_doi {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        int k=1;

        while(k<=t)
        {
            int dem=0;
            int ok=0;
            long  n=sc.nextLong();
            long a[]={} ;
            int i=0;
             while(n>0){
                 long x=n%10;
                 n=n/10;
                 a[i]=x;
                 i=i+1;
                 if(x!=0&&x!=1&&x!=9&&x!=8){
                     ok=1;
                     break;
                 }
             }
            if(ok==1)
            System.out.println("INVALID");
          else {
              for(int j=0;j<i;j++){
                  if(a[i]==0&&dem==1) System.out.println(0);
                  if(a[i]==1) {
                      System.out.println(1);
                      dem=1;
                  }
                  if(a[i]==9&&dem==1) System.out.println(0);
                  if(a[i]==8&&dem==1) System.out.println(0);
              }
            }

            k=k+1;
        }

    }
}


