import java.util.Scanner;

public class sap_xep_chen {

    // Phương thức sắp xếp chèn
    public static void sort(int arr[]) {
        int n = arr.length;
        System.out.println("Buoc 0: "+arr[0]);

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.print("Buoc "+i+": ");

            for (int o = 0; o < i+1; ++o)
                System.out.print(arr[o] + " ");
            System.out.println();
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
