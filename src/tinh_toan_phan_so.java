/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author 84372
 */import java.math.BigInteger;
import java.util.Scanner;

public class tinh_toan_phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction tmp = a.add(b);
            // c = (a+b)^2
            Fraction c = tmp.multiply(tmp);
            // d = a*b*c
            Fraction d = a.multiply(b).multiply(c);
            
            System.out.println(c + " " + d);
        }
        sc.close();
    }
}

class Fraction {
    Long numerator, denominator;

    public Fraction(Long numerator, Long denominator) {
        Long gcd = BigInteger.valueOf(numerator).gcd(BigInteger.valueOf(denominator)).longValue();
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction add (Fraction b) {
        return new Fraction(numerator * b.denominator + b.numerator * denominator, denominator * b.denominator);
    }

    public Fraction multiply (Fraction b) {
        return new Fraction(numerator * b.numerator, denominator * b.denominator);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    
}
