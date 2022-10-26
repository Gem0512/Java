package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class bo_ba_so_pytago {

    // Phương thức sắp xếp chèn
    public static void sort(long a[],int n) {
        for(int i = 0; i < n - 1; i++){
        for(int j = i + 1; j < n; j++){
            if(a[i] > a[j]){
                // Hoan vi 2 so a[i] va a[j]
                long tg = a[i];
                a[i] = a[j];
                a[j] = tg;        
            }
        }
    }
    }



    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
           int n=sc.nextInt();
        long[] arr = new long[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        sort(arr,n);
        long  a, b, c;
//		int arr[] = Arrays.copyOf(ar, ar.length);
//                 Arrays.sort(arr);
//                System.out.println(Arrays.toString(arr));
               
                  
		for (int i = 0; i < n; i++)
			arr[i] = (arr[i] * arr[i]);
		int check = 0;
		for (int i = 0; i < n; i++)
		{
			int  left = n - 2, right = n - 1;
			a = arr[i];
			while (left > i)
			{
				b = arr[left];
				c = arr[right];
				long  tmp = c - b;
				if (tmp == a)
				{
					check = 1;
					break;
				}
				else if (tmp > a)
					right--;
				else
					left--;
			}
		}
		if (check==1)
			         System.out.println("YES");
		else
			         System.out.println("NO");
       }

    }
}
