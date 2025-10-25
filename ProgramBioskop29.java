import java.util.Scanner;
public class ProgramBioskop29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlPenonton, jmlTiket, totalPendapatan = 0;

        System.out.println("Masukkan jumlah pelanggan hari ini: ");
        jmlPenonton = input.nextInt();

        for (int i = 1; i <= jmlPenonton; i++) {
            System.out.print("Masukkan jumlah tiket yang dibeli oleh pelanggan ke-" + i + ": ");
            jmlTiket = input.nextInt();
            if (jmlTiket > 10) {
                System.out.println("Diskon 15% diberikan kepada pelanggan ke-" + i + " Total: Rp " + (jmlTiket * 50000 * 0.85));
                totalPendapatan += jmlTiket * 50000 * 0.85;
            } else if (jmlTiket > 4) {
                System.out.println("Diskon 10% diberikan kepada pelanggan ke-" + i + " Total: Rp " + (jmlTiket * 50000 * 0.90));
                totalPendapatan += jmlTiket * 50000 * 0.90;
            } else if (jmlTiket > 0) {
                System.out.println("Total uang yang didapatkan dari pelanggan ke-" + i + " adalah Rp " + (jmlTiket * 50000));
                totalPendapatan += jmlTiket * 50000;
            } else {
                System.out.println("Jumlah tiket tidak valid untuk pelanggan ke-" + i + ", Masukkan lagi jumlah tiket yang benar.");
                i--;
            }
        }
        System.out.println("Total pendapatan bioskop hari ini: Rp " + totalPendapatan);
        input.close();
    }
}