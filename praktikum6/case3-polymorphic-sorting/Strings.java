import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] words;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah kata: ");
        size = scan.nextInt();
        scan.nextLine();

        words = new String[size];

        System.out.println("Masukkan kata:");
        for (int i = 0; i < size; i++) {
            words[i] = scan.nextLine();
        }

        Sorting.selectionSort(words);

        System.out.println("Hasil pengurutan:");
        for (String word : words) {
            System.out.println(word);
        }

        scan.close();
    }
}
