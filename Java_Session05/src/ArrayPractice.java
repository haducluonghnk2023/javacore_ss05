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

        while (true) {
            System.out.println("\nChọn thao tác:");
            System.out.println("1. Chèn phần tử");
            System.out.println("2. Sửa phần tử");
            System.out.println("3. Xóa phần tử");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) { // Chèn phần tử
                System.out.println("Nhập giá trị cần chèn:");
                int value = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập vị trí cần chèn:");
                int index = Integer.parseInt(sc.nextLine());

                if (index < 0 || index > arr.length) {
                    System.err.println("Chỉ số không hợp lệ.");
                    continue;
                }

                int[] newArr = new int[arr.length + 1];
                for (int i = 0, j = 0; i < newArr.length; i++) {
                    if (i == index) {
                        newArr[i] = value;
                    } else {
                        newArr[i] = arr[j++];
                    }
                }
                arr = newArr;

            } else if (choice == 2) { // Sửa phần tử
                System.out.println("Nhập vào vị trí cần sửa:");
                int index = Integer.parseInt(sc.nextLine());

                if (index < 0 || index >= arr.length) {
                    System.err.println("Chỉ số không hợp lệ!");
                    continue;
                }

                System.out.println("Nhập vào giá trị mới:");
                arr[index] = Integer.parseInt(sc.nextLine());

            } else if (choice == 3) { // Xóa phần tử
                System.out.println("Nhập vào chỉ số phần tử cần xóa:");
                int index = Integer.parseInt(sc.nextLine());

                if (index < 0 || index >= arr.length) {
                    System.err.println("Chỉ số không hợp lệ!");
                    continue;
                }

                int[] newArr = new int[arr.length - 1];
                int j = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (i != index) {
                        newArr[j++] = arr[i];
                    }
                }
                arr = newArr;

            } else if (choice == 4) {
                System.out.println("Thoát chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ.");
            }

            System.out.print("Mảng sau khi cập nhật: ");
            for (int num : arr) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
        sc.close();
    }
}
