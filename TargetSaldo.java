package pert6;
    import java.util.Scanner;

public class TargetSaldo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: Rp ");
        double saldo = input.nextDouble();

        System.out.print("Masukkan bunga per bulan (%): ");
        double bungaPerBulan = input.nextDouble();

        System.out.print("Masukkan saldo target: Rp ");
        double saldoTarget = input.nextDouble();

        int bulan = 0;

        System.out.println("\nPerhitungan Saldo per Bulan:");

        while (saldo < saldoTarget) {
            bulan++;
            saldo += saldo * (bungaPerBulan / 100);
            System.out.printf("Saldo di bulan ke-%d: Rp %.2f%n", bulan, saldo);
        }

        System.out.printf("\nDibutuhkan %d bulan untuk mencapai atau melebihi saldo target.\n", bulan);
    }
}


