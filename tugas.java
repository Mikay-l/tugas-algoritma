import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String golongan;
        int jamLembur;
        double gajiPokok = 0, persen = 0, gajiLembur, totalPenghasilan;

        // Input Golongan //
        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = input.next().toUpperCase();

        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Tidak Termasuk Dalam Golongan");
            return; 
        }
        
        System.out.print("Masukkan Jumlah Jam Lembur: ");
        jamLembur = input.nextInt();

        if (jamLembur == 1) {
            persen = 0.30;
        } else if (jamLembur == 2) {
            persen = 0.32;
        } else if (jamLembur == 3) {
            persen = 0.34;
        } else if (jamLembur == 4) {
            persen = 0.36;
        } else if (jamLembur >= 5) {
            persen = 0.38;
        } else {
            persen = 0;
        }
        gajiLembur = gajiPokok * persen;
        totalPenghasilan = gajiPokok + gajiLembur;

        System.out.println("HASIL PERHITUNGAN GAJI");
        System.out.println("Golongan Karyawan    : " + golongan);
        System.out.println("Gaji Pokok           : Rp " + (int)gajiPokok);
        System.out.println("Gaji Lembur          : Rp " + (int)gajiLembur);
        System.out.println("Total Penghasilan    : Rp " + (int)totalPenghasilan);
    }
}
