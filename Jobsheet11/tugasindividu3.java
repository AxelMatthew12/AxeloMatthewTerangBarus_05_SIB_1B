package Jobsheet11;
import java.util.Scanner;

public class tugasindividu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            cetakPersegiAngka(N);
        }
    }

    static void cetakPersegiAngka(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print( "5 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
