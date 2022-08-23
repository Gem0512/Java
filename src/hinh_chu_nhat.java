import java.util.Scanner;

public class hinh_chu_nhat {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a<=0||b<=0) {
            System.out.println(0);
        }
        else{
            long c=2*a+2*b;
            long s=a*b;

            System.out.println(c+" "+ s);
        }



    }
}
