import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class tinh_so_fibonacci {

    // Ham Kiem tra n co phai la so nguyen to hay khong
    public static long Fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        long i;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public static long check(long value) {
        long i = 0;
        while(value > Fibonacci(i))
        {
            ++i;
        }
        if(value == Fibonacci(i))
            return 1;
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
                 if(check(n)==1)
                System.out.println("YES");
                 else
                     System.out.println("NO");
            t--;
        }

    }
}













//
//
//import java.util.Collections;
//        import java.util.Scanner;
//        import java.util.Vector;
//
//public class sap_xep_chen {
//
////    // Phương thức sắp xếp chèn
////    public static void sort(int arr[]) {
////        int n = arr.length;
////        System.out.println("Buoc 0: "+arr[0]);
////
////        for (int i = 1; i < n; ++i) {
////            int key = arr[i];
////            int j = i - 1;
////            while (j >= 0 && arr[j] > key) {
////                arr[j + 1] = arr[j];
////                j = j - 1;
////            }
////            arr[j + 1] = key;
////            System.out.print("Buoc "+i+": ");
////
////            for (int o = 0; o < i+1; ++o)
////                System.out.print(arr[o] + " ");
////            System.out.println();
////        }
////    }
//
//
//
//    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] a = new int[n];
//
//        for(int i=0;i<n;i++){
//            a[i] = sc.nextInt();
//        }
//        int ve[];
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print("Buoc "+i+": ");
//            Vector<Integer> v = new Vector<Integer>(n);
//            Collections.sort(v);
//            for (Integer x:v)
//            {
//                System.out.print(x);
//            }
//            System.out.println();
//
//        }
//
//    }
//}
