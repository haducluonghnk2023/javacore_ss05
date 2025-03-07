import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử của mảng :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " +(i+1) + ":");
            arr[i] = sc.nextInt();
        }
        int countEven = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Số lượng phần tử chẵn trong mảng là: " + countEven);
    }
}
