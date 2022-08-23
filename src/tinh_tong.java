import java.util.Scanner;

public class tinh_tong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t>0){
            long n = Integer.parseInt(sc.nextLine());


            System.out.println((n*(n+1))/2);
            t=t-1;
        }


    }
}
