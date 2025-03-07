import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng :");
        int n = sc.nextInt();
        if (n < 0){
            System.out.println("Kich thước mảng không thể âm.");
            sc.close();
            return;
        }
        if (n == 0){
            System.out.println("Kích thước mảng rỗng.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("hap phần tử thứ " + (i+1) +":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu :" + Arrays.toString(arr));
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược là : " + Arrays.toString(arr));
        sc.close();
    }
}
