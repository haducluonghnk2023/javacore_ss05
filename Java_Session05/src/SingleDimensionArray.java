import java.sql.SQLOutput;
import java.util.Scanner;

public class SingleDimensionArray {
    public static void main(String[] args) {
        /*
        *  Xây dựng ứng dụng java console
        * 1. Khai báo và khởi tạo mảng số nguyên 1 chiều gồm 100 phần tử
        * 2. in menu và thực hiện các chức năng theo menu
        * *****************MENU*********************
        * 1. Nhập giá trị các phần tử mảng
        * 2. In ra giá trị các phần tử mảng
        * 3. Tính tổng các phần tử mảng
        * 4. In ra các ph tử chia hết cho 3 và tính tổng
        * 5. In ra các phần tử là số nguyên tố và tính tổng
        * 6. Thoát
        * */
        // Syntax : Datatype[] arrayName = new Datatype[size]
        int[] numbers = new int[100];
        // in menu và thực hiện các chức năng theo menu
        Scanner sc = new Scanner(System.in);
        int currentIndex = 0;
        do {
            System.out.println("********************MENU********************");
            System.out.println("1. Nhập giá trị các phần tử :");
            System.out.println("2. In giá trị các phần tử");
            System.out.println("3. Tính tổng các phần tử");
            System.out.println("4. In ra các phần tử chia hết cho 3 và tính tổng");
            System.out.println("5. In ra các phần tử là số nguyên tố và tính tổng");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số phần tử ần nhập giá trị");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.printf("numbers[%d] = ", currentIndex);
                        numbers[currentIndex] = Integer.parseInt(sc.nextLine());
                        currentIndex++;
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng là:");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.printf("%d\t", numbers[i]);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        sum += numbers[i];
                    }
                    System.out.println("Tổng các phần tử trong mảng là "+sum);
                    break;
                case 4:
                    System.out.println("Các số chia hết cho 3 là :");
                    int totalNumber = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        if (numbers[i] % 3 == 0) {
                            totalNumber += numbers[i];
                            System.out.printf("%d\t", numbers[i]);
                        }
                    }
                    System.out.println("\nTổng các số chia hết cho 3 trong mảng là " + totalNumber);
                    break;
                case 5:
                    System.out.println("Các số nguyên tố là:");
                    int totalPrime = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        int num = numbers[i];
                        if (num <= 1) {
                            continue;
                        }
                        boolean isPrime = true;
                        for (int j = 2; j <= Math.sqrt(num); j++) {
                            if (num % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.printf("%d\t", num);
                            totalPrime += num;
                        }
                    }
                    System.out.println("\nTổng các số nguyên tố là: " + totalPrime);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-6 :");
            }
        }while(true);
    }
}