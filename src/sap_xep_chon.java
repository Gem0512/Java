import java.util.Scanner;

public class sap_xep_chon {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int  i=0;i<n;i++) {
            int e=sc.nextInt();
            a[i]=e;
        }

        for (int i = 0; i < n - 1; i++)
        {
            int k = i;
            int temp = a[i];
            for (int j = i + 1; j < n; j++)
            {
                if (a[j] < temp)
                {
                    k = j;
                    temp = a[j];
                }
            }
            int o =a[i];
            a[i]=a[k];
            a[k]=o;
            System.out.print("Buoc "+ (i+1)+": ");

            for (int l = 0; l < n; l++)
                System.out.print(a[l]+" ");

            System.out.println();

        }



    }
}


