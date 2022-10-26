/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 84372
 */
public class sap_xep_ds_doi_tg_nv {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> nv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++)
            nv.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine()));
        nv.sort((a, b) -> a.date.compareTo(b.date));
        for (NhanVien i : nv)
            System.out.println(i);
        sc.close();
    }
    
        
    }
        class NhanVien{
        String id,name,gender,address, tax,date2;
        Date date;

        public NhanVien(int i, String name, String gender, String date, String address, String tax, String date2)throws ParseException {
            this.id = String.format("%05d", i);
            this.name = name;
            this.gender = gender;
            this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            this.address = address;
            this.tax = tax;
            this.date2 = date2;
        }
         @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + address
                + " " + tax + " " + date2;
    }
}
