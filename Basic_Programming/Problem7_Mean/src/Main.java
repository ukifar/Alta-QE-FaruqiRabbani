import java.util.Scanner;

public class Main {
    private static float Mean(float[] numbers) {
        float jumlah=0;
        float rataRata=0;

        for (int i=0; i< numbers.length; i++) {
            jumlah = jumlah + numbers[i];
        }

        rataRata = jumlah/numbers.length;
        return rataRata;
    }

    public static void main(String[] args) {
        System.out.println("Masukkan Panjang Array:");
        Scanner input = new Scanner(System.in);
        int panjangArray = input.nextInt();
        float[] numbers = new float[panjangArray];

        for (int i=0; i<numbers.length; i++) {
            System.out.println("Silahkan Masukkan Angka Ke-"+(i+1));
            numbers[i] = input.nextFloat();
        }

        System.out.println("Rata-Ratanya adalah : "+Mean(numbers));
    }
}