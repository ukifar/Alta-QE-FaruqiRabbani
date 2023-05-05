import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println();
            System.out.println("============================================");
            System.out.println("Menu Program:");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Volume Balok");
            System.out.println("3. Hitung Volume Tabung");
            System.out.println("4. EXIT");
            System.out.println("Silahkan Masukkan Angka 1/2/3/4: ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("Masukkan Sisi Kubus: ");
                int sisinyaKubus = input.nextInt();
                Kubus kubus = new Kubus(sisinyaKubus);
                System.out.println("Volume Kubus : " + kubus.hitungVolumeKubus());
            } else if (pilihan == 2) {
                System.out.println("Masukkan Panjang Balok: ");
                int panjangnyaBalok = input.nextInt();
                System.out.println("Masukkan Lebar Balok: ");
                int lebarnyaBalok = input.nextInt();
                System.out.println("Masukkan Tinggi Balok: ");
                int tingginyaBalok = input.nextInt();
                Balok balok = new Balok(panjangnyaBalok,lebarnyaBalok,tingginyaBalok);
                System.out.println("Volume Balok : " + balok.hitungVolumeBalok());
            } else if (pilihan == 3) {
                System.out.println("Masukkan Jari-Jari Tabung: ");
                float jarinyaTabung = input.nextInt();
                System.out.println("Masukkan Tinggi Tabung: ");
                float tingginyaTabung = input.nextInt();
                Tabung tabung = new Tabung(jarinyaTabung,tingginyaTabung);
                System.out.println("Volume Tabung : " + tabung.hitungVolumeTabung());
            } else if (pilihan == 4) {
                System.out.println("Terimakasih, have a good day");
                break;
            } else if (pilihan==0 || pilihan>4){
                System.out.println("Nomor yang anda masukkan salah, silahkan pilih nomor 1/2/3/4:");
            } else {
                System.out.println("Tidak Boleh Memasukkan Bilangan Negatif, Anda akan Keluar dari Program!!");
                break;
            }
        } while (pilihan>-1);
    }
}