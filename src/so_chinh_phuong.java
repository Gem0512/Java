import java.util.Scanner;

public class so_chinh_phuong {

    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){

            double n=sc.nextDouble();



            if(checkPerfectSquare(n))     System.out.println("YES");
            else     System.out.println("NO");

            t--;
        }

    }
}


