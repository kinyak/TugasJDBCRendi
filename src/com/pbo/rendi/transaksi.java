package com.pbo.rendi;

import java.util.Scanner;
import java.util.Random;

public class transaksi {
    private static Random random = new Random();
    private static StringBuilder captchaa = new StringBuilder();
    private static String username = "rendi";
    private static String password = "123";
    

    public static void main(String[] args) {
        config.connection();

    for (int i = 0; i < 4; i++) {
        char randomChar;
        randomChar = (char) (random.nextInt(26) + 'A');
        captchaa.append(randomChar);
    }
    String captcha = captchaa.toString();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String un = scanner.next();
        System.out.print("Password: ");
        String pw = scanner.next();

        if (un.equals(username) && pw.equals(password)) {
            
            System.out.println(captcha);
            System.out.print("Masukkan captcha: ");
            String inputCaptcha = scanner.next();

        
            if (inputCaptcha.equals(captcha)) {
                System.out.println("Otentikasi berhasil. Selamat datang, " + un + "!");
                    while(true){

            System.out.print("\n====== MENU ======\n"
            + "1. Tambah Transaksi\n"
            + "2. Lihat Data Barang\n"
            + "3. Hapus Data Barang\n"
            + "4. Update Data Barang\n"
            + "0. Exit\n"
            + "Pilih[1/2/3/4/0] : ");

            Scanner input = new Scanner(System.in);
            String pilihan = input.next();

            if( pilihan.equalsIgnoreCase("0") ){
                System.out.println("Terimakasih!!");
                break;
            }

            switch (pilihan) {
                case "1" :
                    try {
                    
                    view.tambahData();

                } catch (Exception e) {
                    System.err.println("Input tidak valid. Pastikan input sesuai dengan tipe data yang diminta.");
                } finally {
                    System.out.println("===============Kasir===============");
                    String myString = "Rendi";
                    String uppercaseString = myString.toUpperCase();
                    System.out.println("Kasir\t\t\t: " + uppercaseString);
                    
                }
                    break;
                case "2" :
                    view.getAllData();
                    break;
                case "3" :
                    view.deleteData();
                    break;
                case "4" :
                    view.updateData();
                    break;
                default:
                    System.out.println("Pilihan salah!!");
                    break;
                    
            }
        input.close ();
        }
            scanner.close();     
            } else {
                System.out.println("Captcha tidak valid. Autentikasi gagal.");
            }
        } else {
            System.out.println("Nama pengguna atau kata sandi tidak valid. Autentikasi gagal.");
        }
    }
}
