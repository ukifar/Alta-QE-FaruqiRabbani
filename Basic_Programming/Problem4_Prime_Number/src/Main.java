import java.util.Scanner;
public class Main {

    private static boolean primeNumber(int number){
        int counter=0;
        boolean hasil = false;

        for (int i=1; i<=number; i++) {
            if (number % i == 0) {
                counter = counter + 1;
            }
        }

        if (counter ==2) {
            hasil = true;
        } else {
            hasil = false;
        }

        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Silahkan Masukkan Bilangan: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Hasil : "+primeNumber(number));
    }
}