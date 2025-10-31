/**
 * Kelas CalculatorLogic digunakan untuk melakukan operasi matematika dasar.
 * Mendukung operasi penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class CalculatorLogic {
    private double angka1;
    private double angka2;
    private char operator;

    /**
     * Konstruktor untuk membuat objek CalculatorLogic.
     * @param angka1 angka pertama
     * @param angka2 angka kedua
     * @param operator operator matematika (+, -, *, /, %)
     */
    public CalculatorLogic(double angka1, double angka2, char operator) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
    }

    /**
     * Method untuk menghitung hasil sesuai operator.
     * @return hasil perhitungan dalam bentuk double
     * @throws IllegalArgumentException jika operator tidak valid atau pembagian dengan nol
     */
    public double hitung() {
        switch (operator) {
            case '+': return tambah();
            case '-': return kurang();
            case '*': return kali();
            case '/':
                if (angka2 == 0) {
                    throw new IllegalArgumentException("Tidak bisa membagi dengan nol!");
                }
                return bagi();
            case '%':
                if (angka2 == 0) {
                    throw new IllegalArgumentException("Tidak bisa modulus dengan nol");
                }
                return modulus();
            default:
                throw new IllegalArgumentException("Operator tidak valid!");
        }
    }

    /** @return hasil penjumlahan */
    private double tambah() { return angka1 + angka2; }

    /** @return hasil pengurangan */
    private double kurang() { return angka1 - angka2; }

    /** @return hasil perkalian */
    private double kali() { return angka1 * angka2; }

    /** @return hasil pembagian */
    private double bagi() { return angka1 / angka2; }

    /** @return hasil modulus */
    private double modulus() { return angka1 % angka2; }

    /** @return angka pertama */
    public double getAngka1() { return angka1; }

    /** @param angka1 set nilai angka pertama */
    public void setAngka1(double angka1) { this.angka1 = angka1; }

    /** @return angka kedua */
    public double getAngka2() { return angka2; }

    /** @param angka2 set nilai angka kedua */
    public void setAngka2(double angka2) { this.angka2 = angka2; }

    /** @return operator matematika */
    public char getOperator() { return operator; }

    /** @param operator set operator matematika */
    public void setOperator(char operator) { this.operator = operator; }
}