import java.util.Scanner;

public class doi_cho_truc_tiep {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];
        int i,j,p;
        for( i=0;i<n;i++) {
            int e=sc.nextInt();
            a[i]=e;
        }
        for(i=0; i<n-1; i++){
            for(j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    p=a[i];
                    a[i]=a[j];
                    a[j]=p;

                }
            }
            System.out.print("Buoc "+ (i+1)+": ");

            for( j=0;j<n;j++) System.out.print(a[j]+" ");
            System.out.println();
        }


    }
}


