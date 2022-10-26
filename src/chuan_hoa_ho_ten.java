import java.util.Scanner;

public class chuan_hoa_ho_ten {

    // Phương thức sắp xếp chèn
    public static String chuan_hoa(String st) {
        st=st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] temp= st.split(" ");
        st="";
        for(int i=0;i<temp.length;i++) {
            st+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                st+=" ";
        }
        return st;

        }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t>0)
        {
           String s=sc.nextLine();
           int k = 0;
           s=chuan_hoa(s);
           for(int i=0;i<s.length()-1;i++) {
               if (s.charAt(i) == ' ') {
                   k = i;
                   break;
               }
           }
           String s1="";
           String s2="";

            for(int i=0;i<=k;i++)
               s1+=(s.charAt(i));
           s1=s1.toUpperCase();
           for(int i=k+1;i<s.length();i++){
               s2+=(s.charAt(i));

           }

            System.out.println(s2+", "+s1);
            t--;
        }
    }
}
