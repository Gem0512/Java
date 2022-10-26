/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author 84372
 */import java.util.*;

public class day_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            int n = s.length;
            int even = (int) Arrays.asList(s).stream().mapToInt(e -> Integer.parseInt(e)).filter(e -> e%2 == 0).count();
            int odd = n - even;
            System.out.println((n%2 == 0 && even > odd) || (n%2 == 1 && odd > even) ? "YES" : "NO");
        }
        sc.close();
    }
}
