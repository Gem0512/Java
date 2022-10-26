import java.util.Scanner;

public class bien_so_dep {
    public static boolean tang(String s)
    {
        int k = 0;
        for (int i = 5; i < 10; i++)
        {
            if (s.charAt(i) == '.')
            {
                i++;
            }
            if (s.charAt(i+1) == '.')
            {
                if (s.charAt(i) >= s.charAt(i+2))
                {
                    return false;
                }
            }
            else if (s.charAt(i) >= s.charAt(i+1))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean bang(String s)
    {
        int k = 0;
        for (int i = 5; i < 10; i++)
        {
            if (s.charAt(i) == '.')
            {
                i++;
            }
            if (s.charAt(i+1) == '.')
            {
                if (s.charAt(i) != s.charAt(i+2))
                {
                    return false;
                }
            }
            else if (s.charAt(i) != s.charAt(i+1))
            {
                return false;
            }
        }
        return true;
    }


    public static boolean yeu(String s)
    {

        if (s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(10) == s.charAt(9))
            return true;
        return false;
    }
    public static boolean loc(String s)
    {
        for (int i = 5; i < 11; i++)
        {
            if (s.charAt(i) != '.')
            {
                if (s.charAt(i) != '6' && s.charAt(i) != '8')
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String s=sc.next();
            if (loc(s) || yeu(s) || bang(s) || tang(s))
            System.out.println("YES");
            else System.out.println("NO");
            t--;
        }

    }
}
