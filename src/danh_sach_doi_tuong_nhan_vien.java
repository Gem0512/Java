/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

/**
 *
 * @author 84372
 */
public class danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> nv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++)
            nv.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine()));
        for (NhanVien i : nv)
            System.out.println(i);
        sc.close();
    }
}

class NhanVien {
    String id, name, gender, dob, address, tax, signDate;

    public NhanVien(int i, String name, String gender, String dob, String address, String tax, String signDate) {
        this.id = String.format("%05d", i);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.signDate = signDate;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + tax + " " + signDate;
    }

}