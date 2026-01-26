import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diemUyTin = 100;
        int ngayTre;

        System.out.println("--- Nhập lịch sử trả sách (Nhập 999 để kết thúc) ---");
        while (true) {
            System.out.print("Nhập số ngày trễ: ");
            ngayTre = sc.nextInt();

            if (ngayTre == 999) break;

            if (ngayTre <= 0) {
                diemUyTin += 5;
                System.out.println("Trả đúng hạn: +5 điểm");
            } else {
                diemUyTin -= (ngayTre * 2);
                System.out.println("Trả muộn " + ngayTre + " ngày: -" + (ngayTre * 2) + " điểm");
            }
        }

        System.out.println("\nTổng điểm uy tín cuối cùng: " + diemUyTin);
        System.out.print("Xếp loại: ");
        if (diemUyTin > 120) {
            System.out.println("Độc giả Thân thiết");
        } else if (diemUyTin >= 80) {
            System.out.println("Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Độc giả cần lưu ý");
        }
    }
}
