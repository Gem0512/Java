/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author 84372
 */
  import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class chuan_hoa_xau_ho_ten_trong_file {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> res = new ArrayList<>();
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if (nextLine.equalsIgnoreCase("END")) break;
            String[] name = nextLine.trim().toLowerCase().split("\\s+");
            for (int i = 0; i < name.length; i++) 
                name[i] = name[i].substring(0, 1).toUpperCase() + name[i].substring(1);
            res.add(String.join(" ", name));
        }
        res.forEach(System.out::println);
        sc.close();
    }
}