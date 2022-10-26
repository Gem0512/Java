/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author 84372
 */import java.util.Scanner;
import java.util.Stack;

public class rut_gon_xau_ky_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        Stack<Character> st = new Stack<>();
        for (char i : s) {
            if (!st.empty() && st.peek() == i) 
                st.pop();
            else st.push(i);
        }
        System.out.println(st.empty() ? "Empty String" : st.toString().replaceAll("(\\[|\\]|\\s+|,)", ""));
        sc.close();
    }
}