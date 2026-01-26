import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long donGia = 5000;
        long total = 0;

        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của cuốn thứ " + i + ": ");
            int soNgayTre = sc.nextInt();
            total += (long) soNgayTre * donGia;
        }

        System.out.println("Tổng số tiền phạt cuối cùng: " + total + " VNĐ");
    }
}
