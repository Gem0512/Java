import java.util.Scanner;

public class dem_so_lan_xuat_hien {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++){
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean[] b = new boolean[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                b[i]= false;
            }
            System.out.println("Test " + t + ":");
            for(int i=0;i<n;i++){
                if(b[i]==false){
                    int count =1;
                    b[i]=true;
                    for(int j=i+1;j<n;j++){
                        if(a[i]==a[j]){
                            b[j]=true;
                            count++;
                        }
                    }
                    System.out.println(a[i]+" xuat hien " + count + " lan");
                }
            }
        }
        sc.close();


    }
}


