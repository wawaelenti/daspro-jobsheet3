import java.util.Scanner;

public class Ti {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Mesasukkan nilai
        System.out.print("Masukkan nilai kuis (0-100): ");
        double nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS= sc.nextDouble();

        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS = sc.nextDouble();

        //menghitung hasil berdasarkan bobot
        double nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        //Hasil
        System.out.println("Nilai akhir: " + nilaiAkhir);

        sc.close();
    }
    
}
