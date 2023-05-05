import java.util.Scanner;

public class Main {
    private static boolean palindrome(String value) {
        char[] array = value.toCharArray();
        char[] reverseArray = new char[array.length];
        int counter = 0;
        boolean hasil=false;

        for (int i=0; i<value.length(); i++) {
            reverseArray[i] = array[array.length-i-1];
        }

        for (int i=0; i<value.length();i++) {
            if (reverseArray[i] == array[i]) {
                counter++;
            }
        }

        if (counter==reverseArray.length) {
            hasil = true;
        } else {
            hasil = false;
        }

        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Silahkan Masukkan Kata-Kata: ");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        System.out.println("Hasil : "+palindrome(value));
    }
}