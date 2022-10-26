import java.util.Scanner;

/**
 *
 * @author vanchung
 */
public class to_hop {
    public int i, n, k, a[],dem=0;

    public void Init() {
        Scanner input = new Scanner(System.in);
        do {
            this.n = input.nextInt();
            this.k = input.nextInt();
        } while (this.n < 0 || this.k > this.n);

        a = new int[n+1];
        for (int j = 1; j <= this.k; j++)
            a[j] = j;
    }

//    public void Result() {
//        for (int j = 1; j <= k; j++)
//            System.out.print(a[j] + "  ");
//        System.out.println();
//    }
    //Sinh tổ hợp
    public void sinhToHop() {
        dem++;
        do {
            if(this.i ==1)  {
                for (int j = 1; j <= k; j++)
                    System.out.print(a[j] + "  ");
                System.out.println();
                System.out.println(dem);

            }
            else{
                for (int j = 1; j <= k; j++)
                    System.out.print(a[j] + "  ");
                System.out.println();
            }
            this.i = this.k;
            while (this.i > 0 && a[i] == this.n -this.k + i) -- i;
            if (this.i > 0) {
                a[i]++;
                for (int j = i + 1; j <= this.k; j++) {
                    a[j] = a[j-1] + 1;
                }
            }

        } while (this.i != 0);

    }
    public static void main(String[] agrs) {
        to_hop tohop = new to_hop();
        tohop.Init();
        tohop.sinhToHop();
//        System.out.println(dem);
        System.gc();
    }
}