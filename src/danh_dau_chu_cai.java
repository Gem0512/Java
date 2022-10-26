import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class danh_dau_chu_cai {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
            String s=sc.next();
            s=s.toLowerCase();
        Set<String> se = new HashSet<String>();

 for(int i=0;i<s.length();i++)
     se.add(String.valueOf(s.charAt(i)));

        System.out.println(se.size());
    }
}