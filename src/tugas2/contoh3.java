/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author Ramdon
 */
public class contoh3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan baris matriks 1 : ");
        int a = sc.nextInt();
        System.out.print("Masukan kolom matriks 1 : ");
        int b = sc.nextInt();
        System.out.print("Masukan kolom matriks 2 : ");
        int c = sc.nextInt();
        int [][] matrix1 = new int [a][b];
        int [][] matrix2 = new int [b][c];
        
        
        System.out.println("");
        System.out.println("===== ARRAY MATRIKS 1 =====");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("isi : ");
                matrix1 [i][j] = sc.nextInt(); 
            }            
        }
        
        for (int[] is : matrix1) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("===== ARRAY MATRIKS 2 =====");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("isi : ");
                matrix2 [i][j] = sc.nextInt(); 
            }            
        }
        
        for (int[] is : matrix2) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("===== HASIL =====");
        int[][] hasil = new int[a][c];
        int jumlah = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                   jumlah =  jumlah + matrix1[i][k] * matrix2[k][j];
                }
                hasil[i][j]= jumlah;
                jumlah = 0;
            }
        }
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(hasil[i][j]+" ");
            }
            System.out.println();
        }
    }
}
