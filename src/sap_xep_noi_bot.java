import java.util.Scanner;

public class sap_xep_noi_bot {

    // Phương thức sắp xếp chèn
    public static void sort(int a[]) {
        int n=a.length;
        for (int i = 0; i < n - 1; i++)
        {
            int ok = 1;
            for (int j = 1; j < n; j++)
            {
                if (a[j] < a[j - 1])
                {

                    ok = 0;
                    int l=a[j];
                    a[j]=a[j-1];
                    a[j-1]=l;
                }
            }
            if (ok == 0)
            {
                System.out.print("Buoc "+(i+1)+": ");
                for (int j = 0; j < n; ++j)
                    System.out.print(a[j]+" ");
                System.out.println();
            }
            else
                break;
        }
    }



    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sort(a);

    }
}
