import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int[] markingArray = new int[1001];
        int[] originalArray = {10, 20, 30, 10, 40, 50, 20, 10, 60, 70, 80, 20, 90, 100, 30, 10, 10, 50, 999, 1000};
        for (int value : originalArray) {
            markingArray[value]++;
        }
        int maxCount = 0;
        for (int count : markingArray) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println("Phần tử xuất hiện nhiều nhất:");
        for (int i = 1; i < markingArray.length; i++) {
            if (markingArray[i] == maxCount) {
                System.out.println(i + " - Số lần xuất hiện: " + maxCount);
            }
        }
    }
}
