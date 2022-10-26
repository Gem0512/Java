import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ucll_cua_snl {
    public static long __gcd(long a, long b) {
        if (b == 0) return a;
        return __gcd(b, a % b);
    }
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            String s=sc.next();
            long x = 0;
            for (int i = 0; i < s.length(); i++)
            {
                x = (x * 10 + (s.charAt(i) - 48)) % n;
            }
            long c = __gcd(x, n);
            System.out.println(c);
            t--;
        }
    }
}