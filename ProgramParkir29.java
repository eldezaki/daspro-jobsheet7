import java.util.Scanner;
public class ProgramParkir29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.println("Masukkan jenis kendaraan:\n1. Mobil\n2. Motor\n0. Keluar\nPilihan Anda: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                    System.out.println("Biaya: Rp 12500");
                } else {
                    if (jenis == 1) {
                        total += (long) durasi * 3000;
                        System.out.println("Biaya: Rp " + (durasi * 3000));
                    } else if (jenis == 2) {
                        total += (long) durasi * 2000;
                        System.out.println("Biaya: Rp " + (durasi * 2000));
                    }
                }
            } else if (jenis == 0) {
                System.out.println("Program Selesai. Menghitung total pendapatan...");
            } else {
                System.out.println("Input tidak valid. pilih 1, 2, atau 0.");
            }
        } while (jenis != 0);
        System.out.println("Total pendapatan parkir hari ini: Rp " + total);
        sc.close();
    }
}