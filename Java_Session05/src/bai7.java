import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Mảng không có phần tử");
            scanner.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int[] ketQua = new int[n];
        int evenPositon = 0;
        int ollPosition = n - 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                ketQua[evenPositon] = num;
                evenPositon++;
            } else {
                ketQua[ollPosition] = num;
                ollPosition--;
            }
        }
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int num : ketQua) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
