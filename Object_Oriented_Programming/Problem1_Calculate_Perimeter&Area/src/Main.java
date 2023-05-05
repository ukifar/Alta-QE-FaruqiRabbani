import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=1; i>-1; i++) {
            System.out.println();
            System.out.println("============================================");
            System.out.println("1. Hitung Luas dan Keliling Persegi");
            System.out.println("2. Hitung Luas dan Keliling Segitiga");
            System.out.println("3. Hitung Luas dan Keliling Persegi Panjang");
            System.out.println("4. EXIT");
            System.out.println("Silahkan Pilih Angka 1/2/3/4: ");
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("Masukkan Sisi Persegi: ");
                int sisinyaPersegi = input.nextInt();
                Persegi persegi = new Persegi(sisinyaPersegi);
                System.out.println("Luas Persegi: "+persegi.luasPersegi());
                System.out.println("Keliling Persegi: "+persegi.kelilingPersegi());
            } else if (pilihan == 2) {
                System.out.println("Masukkan Alas Segitiga: ");
                double alasnyaSegitiga = input.nextInt();
                System.out.println("Masukkan Tinggi Segitiga: ");
                double tingginyaSegitiga = input.nextInt();
                Segitiga segitiga = new Segitiga(alasnyaSegitiga,tingginyaSegitiga);
                System.out.println("Luas Segitiga: "+segitiga.luasSegitiga());
                System.out.println("Keliling Segitiga: "+segitiga.kelilingSegitiga());
            } else if (pilihan == 3) {
                System.out.println("Masukkan Panjangnya Persegi Panjang: ");
                int panjangnyanyaPersegiPanjang = input.nextInt();
                System.out.println("Masukkan Lebar Persegi Panjang: ");
                int lebarnyanyaPersegiPanjang = input.nextInt();
                PersegiPanjang pergiPanjang = new PersegiPanjang(panjangnyanyaPersegiPanjang,lebarnyanyaPersegiPanjang);
                System.out.println("Luas Persegi Panjang: "+pergiPanjang.luasPersegiPanjang());
                System.out.println("Keliling Persegi Panjang: "+pergiPanjang.kelilingPersegiPanjang());
            } else if (pilihan == 4) {
                System.out.println("Terimakasih, have a good day");
                break;
            } else {
                System.out.println("Nomor yang anda masukkan salah, silahkan pilih nomor 1/2/3/4:");
            }
        }
    }
}

