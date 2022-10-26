import java.util.Scanner;

public class ma_tran_nhi_phan {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[][] = new int[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int dem=0;
        for (int i = 0; i < n; i++) {
            int k=0;
            for (int j = 0; j < 3; j++) {
                if(a[i][j]==1) k++;
            }
            if(k>3-k) dem++;
        }
        System.out.println(dem);

    }
}
