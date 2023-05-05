import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operasi operasi = new Operasi();
        for (int i=1; i>0; i++) {
            System.out.println();
            System.out.println("=================================");
            System.out.println("Menu Program:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. EXIT");
            System.out.println("Silahkan Pilih Angka 1/2/3/4/5: ");
            float pilihan = input.nextFloat();
            if (pilihan == 1) {
                System.out.println("Anda Memilih Penjumlahan, Silahkan Masukkan Angka Pertama:");
                float angkaJumlah1 = input.nextFloat();
                System.out.println("Silahkan Masukkan Angka Kedua:");
                float angkaJumlah2 = input.nextFloat();
                operasi.inputAngka(angkaJumlah1,angkaJumlah2);
                System.out.println(angkaJumlah1 +" + "+angkaJumlah2+" = "+operasi.penjumlahan());
            } else if (pilihan == 2) {
                System.out.println("Anda Memilih Pengurangan, Silahkan Masukkan Angka Pertama:");
                float angkaKurang1 = input.nextFloat();
                System.out.println("Silahkan Masukkan Angka Kedua:");
                float angkaKurang2 = input.nextFloat();
                operasi.inputAngka(angkaKurang1,angkaKurang2);
                System.out.println(angkaKurang1 +" - "+angkaKurang2+" = "+ operasi.pengurangan());
            } else if (pilihan == 3) {
                System.out.println("Anda Memilih Perkalian, Silahkan Masukkan Angka Pertama:");
                float angkaKali1 = input.nextFloat();
                System.out.println("Silahkan Masukkan Angka Kedua:");
                float angkaKali2 = input.nextFloat();
                operasi.inputAngka(angkaKali1,angkaKali2);
                System.out.println(angkaKali1 +" x "+angkaKali2+" = "+ operasi.perkalian());
            } else if (pilihan == 4) {
                System.out.println("Anda Memilih Pembagian, Silahkan Masukkan Angka Pertama:");
                float angkaBagi1 = input.nextFloat();
                System.out.println("Silahkan Masukkan Angka Kedua:");
                float angkaBagi2 = input.nextFloat();
                operasi.inputAngka(angkaBagi1,angkaBagi2);
                System.out.println(angkaBagi1 +" : "+angkaBagi2+" = "+ operasi.pembagian());
            } else if (pilihan == 5) {
                System.out.println("Terimakasih, Have a Good Day!");
                break;
            } else {
                System.out.println("Nomor yang Anda Masukkan Salah, Silahkan Pilih Nomor 1/2/3/4/5!");
            }
        }
    }
}