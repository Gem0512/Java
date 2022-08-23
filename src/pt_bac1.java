import java.util.Scanner;

public class pt_bac1 {

    public static void main(String[] args) {
        float a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        if(a==0&&b!=0) System.out.println("VN");
        else
            if(a==0&&b==0)System.out.println("VSN");
            else
            {
                float  c =-b/a;
                System.out.printf("%.2f", c);

            }

    }
}
