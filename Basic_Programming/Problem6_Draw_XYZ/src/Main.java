import java.util.Scanner;

public class Main {
    private static void DrawXYZ(int n) {
        int counter=0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                counter++;

                if (counter%3 == 0) {
                    System.out.print("X");
                } else if (counter%2 != 0) {
                    System.out.print("Y");
                } else if (counter%2 == 0) {
                    System.out.print("Z");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Silahkan Masukkan Angka: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Hasil : ");
        DrawXYZ(n);
    }
}