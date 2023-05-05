import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = 0;
        System.out.println("Masukkan nilai:");
        nilai = input.nextInt();

        String hasil="";

        if (nilai>=80 && nilai<=100) {
            hasil ="A";
        } else if (nilai>=65 && nilai <=79) {
            hasil = "B+";
        } else if (nilai>=50 && nilai<=64) {
            hasil= "B";
        } else if (nilai>=35 && nilai<=49) {
            hasil="C";
        } else if (nilai>=0 && nilai<=34) {
            hasil="D";
        } else {
            hasil="invalid";
        }

        System.out.println("Nilai: " + hasil);
    }
}