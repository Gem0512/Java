import java.util.Scanner;

public class so_dep_1 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
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
            int ok=1;
            int sum=0;
            String s = sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    ok=0;
                    break;
                }
               if(isPrime(Integer.parseInt(String.valueOf(s.charAt(i))))==false){
                   ok=0;
                   break;
               }
            }
//            System.out.println(sum);
//            if(sum%10!=0)ok=0;
//            if(s.charAt(0)!='8'||s.charAt(s.length()-1)!='8') ok=0;
////            System.out.println(s.charAt(0) +" "+ s.charAt(s.length()-1) );
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }

    }
}
