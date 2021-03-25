package Tugas2;
import java.util.Scanner;
public class No4 {
      public static void main(String[] args) {
    int a, b, x, y;  //x=ukuran baris  //y=ukuran kolom
    int matriks[][] = new int[10][10];
    int transpose[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);  //perintah untuk mengambil data
    
    System.out.print("Masukkan jumlah baris matriks : ");
    x = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks : ");
    y = scan.nextInt();
    System.out.println("Masukkan elemen matriks : ");
    for(a = 0; a < x; a++) {
        for(b = 0; b < y; b++) {
            matriks[a][b] = scan.nextInt();
        }
    }
    System.out.println("Hasil matriks : ");
    for(a = 0; a < x; a++) {
        for(b = 0; b < y; b++) {
            System.out.print(matriks[a][b] + "\t");
        }
        System.out.println();
    }
    
    for(a = 0; a < x; a++) {
        for(b = 0; b < y; b++) {
            transpose[b][a] = matriks[a][b];
        }
    }
    System.out.println("Hasil transpose matriks : ");
    for(a = 0; a < y; a++) {
        for(b = 0; b < x; b++) {
            System.out.print(transpose[a][b] + "\t");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("RR. Niken Pambayun Dyah Setyawati");
    }
}
