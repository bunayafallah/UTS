/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Ramdon
 */
public class contoh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [][][] angka ={     // {kolom1,kolom2,kolom3}
                           {{34,56,41},    // baris ke-0
                           {45,36,37},    // baris ke-1
                           {51,32,46}}
                           };   // baris ke-2 
       // mendeklarasikan baris dan kolom
        int i, j,k;  // i = baris, j = kolom
        for ( i=0 ; i<angka.length; i++){        // menampilkan elemen sejumlah baris
            for ( j=0 ; j<angka[0].length; j++){    // menampilkan elemen sejumlah kolom
                for ( k=0 ; k<angka[0].length; k++){  
                    // menampilkan isi elemen baris dan kolom
                    System.out.print(angka[i][j][k]+" "); 
                }
                    System.out.println("");         //pindah baris
            }
                    System.out.println("");         //pindah baris
                    System.out.println("Bunaya Fallah Muyassar");
        }
        
    }
}

