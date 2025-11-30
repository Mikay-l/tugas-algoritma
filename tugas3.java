import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        int[] gaji = {5000000, 6500000, 9500000};

        int[] persenLembur = {30, 32, 34, 36, 38};

        System.out.print("Masukkan Golongan (A/B/C): ");
        String gol = input.next().toUpperCase();
        
        System.out.print("Masukkan Jumlah Jam Lembur (1/2/3/4/5): ");
        int jam = input.nextInt();

        int indexGol = -1;

        if (gol.equals("A")) {
            indexGol = 0;
        } else if (gol.equals("B")) {
            indexGol = 1;
        } else if (gol.equals("C")) {
            indexGol = 2;
        } else {
            
            System.out.println("Tidak Termasuk Dalam GLolongan!");
            return;
        }
        int gajiPokok = gaji[indexGol];

        int persen;
        if (jam >= 5) {
            persen = persenLembur[4]; // 38%
        } else if (jam == 4) {
            persen = persenLembur[3]; // 36%
        } else if (jam == 3) {
            persen = persenLembur[2]; // 34%
        } else if (jam == 2) {
            persen = persenLembur[1]; // 32%
        } else if (jam == 1) {
            persen = persenLembur[0]; // 30%
        } else {
            persen = 0;
        }

        double gajiLembur = (double) gajiPokok * persen / 100;

        double totalGaji = gajiPokok + gajiLembur;
        
        System.out.println("--> JUMLAH PERHITUNGAN <--");
        System.out.println("Golongan        : " + gol);
        System.out.println("Gaji Pokok      : Rp " + gajiPokok);
        System.out.println("Jam Lembur      : " + jam);
        System.out.println("Persen Lembur   : " + persen + "%");
        System.out.println("Gaji Lembur     : Rp " + gajiLembur);
        System.out.println("Total Gaji      : Rp " + totalGaji);
    }
}
