/*NIM   : 13020210236
Nama    : Asprianti Inda Cahyani J
Hari/Tgl: Sabtu, 11 Maret 2023
Waktu   : 00:30 AM*/
package tugas4;
import java.util.Scanner;

public class BacaData {

    /**
     * @param args
     */

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print("Contoh membaca dan menulis, ketik nilai integer : \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); Apa akibatnya?*/
        System.out.print("Nilai yang dibaca : " +a);
    }
    
}