import java.util.Scanner;

public class TwoDimensionsArray {
    public static void main(String[] args) {
        /*
        * Viết chương trình java console thực hiện
        * 1. Khai báo mảng số nguyên gồm n dòng và m cột
        * 2. In menu và thực hiên các chức năng theo menu
        * ******************MENU******************
        * 1. Nhập giá trị các phần tử của mảng
        * 2. In giá trị các phần tử của mảng
        * 3. Kiểm tra sự tồn tại của 1 giá trị trong mảng
        * 4. Thoát
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng 2 chiều:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột của mảng 2 chiều:");
        int m = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][m];
        // 2. In menu và thực hiện các chức năng theo menu
        do {
            System.out.println("************MENU************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. Hiển thị giá trị các phần tử theo ma trận");
            System.out.println("3. Kiểm tra sự tồn tại của 1 giá trị");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("arr[%d][%d] = ", i, j);
                            arr[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    for (int  i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("%5d", arr[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào giá trị cần tìm:");
                    int searchValue = Integer.parseInt(sc.nextLine());
                    boolean isExist = false;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (searchValue == arr[i][j]) {
                                System.out.println("Bingo");
                                isExist = true;
                                break;
                            }
                        }
                    }
                    if (!isExist) {
                        System.out.printf("Không tồn tại giá trị %d trong mảng\n",searchValue);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng lựa chọn từ 1-4");
            }
        }while(true);
    }
}
