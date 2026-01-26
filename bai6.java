import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int tongMuon = 0;
        int soNgayMoCua = 0;

        for (int i = 2; i <= 8; i++) {
            String tenNgay = (i == 8) ? "Chủ Nhật" : "Thứ " + i;
            System.out.print("Nhập số lượt mượn " + tenNgay + ": ");
            int luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue; // Thư viện đóng cửa, không tính vào thống kê
            }

            // Tìm Max, Min
            if (luotMuon > max) max = luotMuon;
            if (luotMuon < min) min = luotMuon;

            // Tích lũy để tính trung bình
            tongMuon += luotMuon;
            soNgayMoCua++;
        }

        if (soNgayMoCua > 0) {
            double trungBinh = (double) tongMuon / soNgayMoCua;
            System.out.println("\n--- Kết quả thống kê ---");
            System.out.println("Lượt mượn cao nhất: " + max);
            System.out.println("Lượt mượn thấp nhất: " + min);
            System.out.printf("Trung bình lượt mượn (trong %d ngày mở cửa): %.2f\n", soNgayMoCua, trungBinh);
        } else {
            System.out.println("Thư viện đóng cửa cả tuần, không có dữ liệu thống kê.");
        }
    }
}
