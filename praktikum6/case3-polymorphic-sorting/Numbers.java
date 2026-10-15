
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        size = scan.nextInt();

        intList = new Integer[size];

        System.out.println("Masukkan angka:");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }

        Sorting.selectionSort(intList);

        System.out.println("Hasil pengurutan:");
        for (int number : intList) {
            System.out.println(number);
        }

        scan.close();
    }
}
