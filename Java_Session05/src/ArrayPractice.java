import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        // 1. Nhập số phần tử, khai báo mảng và nhập giá trị
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        // 2. Nhập giá trị và chỉ số cần chèn
        System.out.println("Nhập vào giá trị phần tử cần chèn:");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào chỉ số phần tử cần chèn:");
        int index = Integer.parseInt(sc.nextLine());

        // 3. Kiểm tra chỉ số hợp lệ
        if (index < 0) {
            System.err.println("Chỉ số không hợp lệ: " + index);
            return;
        }

        // 4. Khai báo mảng mới có kích thước đủ lớn để chứa phần tử mới
        int newSize = Math.max(arr.length, index + 1); // Đảm bảo mảng đủ lớn để chứa chỉ số mới
        int[] newArray = new int[newSize];

        // 5. Sao chép các phần tử từ mảng cũ sang mảng mới
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        // 6. Gán giá trị tại vị trí chỉ định
        newArray[index] = value;

        // 7. In ra mảng sau khi chèn
        System.out.print("Mảng sau khi chèn: ");
        for (int num : newArray) {
            System.out.printf("%d ", num);
        }
    }
}
