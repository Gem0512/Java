/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author 84372
 */
public class so_khac_nhau_trong_file_2 {
  
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] map = new int[1005];
        for (int i = 0; i < 100000; i++) {
            map[sc.readInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (map[i] > 0) {
                System.out.println(i + " " + map[i]);
            }
        }
        sc.close();
    }
}

