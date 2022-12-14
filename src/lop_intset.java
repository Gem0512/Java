/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author 84372
 */import java.util.*;

public class lop_intset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

class IntSet {
    int[] arr;
    TreeSet<Integer> set;

    public IntSet(TreeSet<Integer> s) {
        this.set = new TreeSet<>(s);
    }

    public IntSet(int[] arr) {
        this.arr = arr;
        this.set = new TreeSet<>();
        for (int i : arr)
            this.set.add(i);

    }

    public TreeSet<Integer> getSet() {
        return this.set;
    }

    public IntSet union(IntSet a) {
        TreeSet<Integer> tmp = new TreeSet<>(set);
        tmp.addAll(a.getSet());
        return new IntSet(tmp);
    }

    @Override
    public String toString() {
        TreeSet<String> strs = new TreeSet<>();
        set.forEach(number -> strs.add(number.toString()));
        return String.join(" ", strs);
    }

}