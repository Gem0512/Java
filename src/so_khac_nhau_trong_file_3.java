/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author 84372
 */
public class so_khac_nhau_trong_file_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> data = (ArrayList<Integer>) o.readObject();
        int[] m = new int[1000005];
        Arrays.fill(m, 0);
        data.forEach(e -> m[e]++);
        for (int i = 0; i <= 1000; i++) {
            if (m[i] > 0) {
                System.out.println(i + " " + m[i]);
            }
        }
    }
}
