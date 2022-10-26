//import java.math.BigInteger;
//import java.util.Scanner;
////
//public class hieu_2_snl {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();
//        while (t-- > 0) {
//            BigInteger a = input.nextBigInteger();
//            BigInteger b = input.nextBigInteger();
//            int length = Math.max(a.toString().length(), b.toString().length());
//            System.out.println(String.format("%" + length + "s", a.subtract(b).abs().toString()).replace(' ', '0'));
//        }
//        input.close();
//    }
//}

import java.util.Scanner;

public class hieu_2_snl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextBigInteger().subtract(input.nextBigInteger()));
        input.close();
    }
}