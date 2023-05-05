import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = 0;
        System.out.println("Masukkan Bilangan:");
        nilai = input.nextInt();
        System.out.println("Faktor Bilangannya adalah: ");

        for (int i=1; i<=nilai; i++) {
            if (nilai%i==0) {
                System.out.println(i);
            }
        }

    }
}