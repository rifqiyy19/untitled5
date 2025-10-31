import java.util.Scanner;

/**
 * Kelas Main merupakan titik awal program kalkulator sederhana.
 * Program ini menerima input dua angka dan operator dari pengguna,
 * kemudian menghitung hasil menggunakan kelas CalculatorLogic.
 */
public class Main {
    /**
     * Method utama untuk menjalankan program kalkulator.
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operatorPilihan = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = input.nextDouble();

        CalculatorLogic kalkulator = new CalculatorLogic(angkaPertama, angkaKedua, operatorPilihan);

        try {
            double hasil = kalkulator.hitung();
            System.out.println("Hasil: " + hasil);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}