import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Halo, ini program untuk menghitung luas segitiga");

        System.out.println("Silahkan masukkan alas:");
        Scanner input = new Scanner(System.in);
        float alas = input.nextFloat();
        System.out.println("Silahkan masukkan tinggi:");
        float tinggi = input.nextFloat();

        float luas = ((alas*tinggi)/2);

        System.out.println("Luas segitiga adalah: " + luas);
    }
}