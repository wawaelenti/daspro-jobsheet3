import java.util.Scanner;

public class DiskonTes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input harga asli dan diskon
        System.out.print("Masukkan harga asli: ");
        double hargaAsli = sc.nextDouble();

        System.out.print("Masukkan persentase diskon (contoh 20 untuk 20%): ");
        double diskonPersen = sc.nextDouble();

        //Hitung diskon
        double diskon = diskonPersen / 100;
        double totalHarga = hargaAsli - (hargaAsli * diskon);
        
        System.out.println("Total harga (double): " + totalHarga);

        //Menyimpan total hrg dlm variabel byte pakai casting
        byte totalByte = (byte) totalHarga;
        System.out.println("Total harga setelah casting ke byte: " + totalByte);

        sc.close();
    }
}