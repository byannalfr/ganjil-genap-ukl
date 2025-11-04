package byannalfr;

import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /// input bilangan
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scanner.nextInt();
        /// ganjil atau genap??
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
        scanner.close();
    }
}

