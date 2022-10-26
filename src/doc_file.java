/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author 84372
 */import java.io.File;
import java.util.Scanner;

public class doc_file {
    public static void main(String[] args) {
        try {
            File myFile = new File("DATA.in");
            Scanner input = new Scanner(myFile);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}