import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Mảng không hợp lệ");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Đếm tần suất xuất hiện của từng phần tử
        int[] counts = new int[100001];
        for (int num : arr) {
            counts[num]++;
        }
        // Tạo mảng mới chỉ chứa các phần tử duy nhất
        int[] uniqueArr = new int[n];
        int uniqueCount = 0;
        for (int num : arr) {
            if (counts[num] == 1) {
                boolean isDuplicate = false;
                for (int i = 0; i < uniqueCount; i++) {
                    if (uniqueArr[i] == num) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    uniqueArr[uniqueCount++] = num;
                    counts[num] = 0; // Để tránh lặp lại cùng phần tử
                }
            }
        }
        // Kiểm tra nếu mảng chỉ chứa các phần tử trùng lặp
        if (uniqueCount == 0) {
            System.out.println("Không có phần tử nào duy nhất trong mảng");
        } else {
            System.out.println("Mảng sau khi xóa các phần tử trùng lặp:");
            for (int i = 0; i < uniqueCount; i++) {
                System.out.print(uniqueArr[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
