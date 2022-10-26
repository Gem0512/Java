import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class so_uu_the {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       while(t>0){
           String s=sc.next();
           int chan=0;
           int le=0;
           int ok=1;
           for(int i=0;i<s.length();i++){
               if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                   ok=0;
                   break;
               }
               if(Integer.parseInt(String.valueOf(s.charAt(i)))% 2==0)chan++;
               else le++;
           }
           if(s.charAt(0)=='0'||ok==0) System.out.println("INVALID");
           else{
               if((s.length()%2==0&&chan>le)||(s.length()%2!=0&&chan<le)) System.out.println("YES");
               else System.out.println("NO");
           }
           t--;
       }
    }
}