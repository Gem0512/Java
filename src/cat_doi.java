import java.util.Scanner;

public class cat_doi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            int ok=0;
            int c=0;
            String s1="";
            for(int i=0;i<s.length();i++){
                
                if(s.charAt(i)=='0'||s.charAt(i)=='9'||s.charAt(i)=='8')
                {
                    if(c==1){
                        s1=s1+"0";
                    }
                }
                else 
                   if(s.charAt(i)=='1')
                     {
                       s1=s1+"1";
                        c=1;
                     }
                   else {
                    ok=1;
                    break;
                   }
            } 
            if(ok==1||c==0)     System.out.println("INVALID");
            else   System.out.println(s1);
            t--;

        }
      
        
       

    }
}
