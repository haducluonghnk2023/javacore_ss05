import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng :");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Kích thước mảng phải lớn hơn 0.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+(i+1)+" là :");
            arr[i] = sc.nextInt();
        }
        int maxLe = Integer.MIN_VALUE;
        int minLe = Integer.MAX_VALUE;
        boolean flag = false;
        for (int num:arr) {
            if(num > 0 && num % 2 != 0){
                flag = true;
                if(num > maxLe){
                    maxLe = num;
                }
                if(num < minLe){
                    minLe = num;
                }
            }
        }
        if(!flag){
            System.out.println("Không có phần tử lẻ trong mảng.");
        }else {
            System.out.println("Giá trị lẻ nguyên dương lớn nhất trong mảng là :"+maxLe);
            System.out.println("Giá trị lẻ nguyên dương nhỏ nhất trong mảng là :"+minLe);
        }
    }
}
