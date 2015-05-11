package array5214057;
import java.util.Scanner;
public class Array5214057 {
    static int opsi1,opsi2,wh=1,wh2=1;
    public static void main(String[] args) {
        String [] nama = new String[3];
        Scanner masuk = new Scanner(System.in);
        while(wh==1) {
            System.out.print("Pilihan Program:"
                    + "\n 1. Array 1 Dimensi \"Tiga Teman Dekat\" "
                    + "\n 2. Array 2 Dimensi \"Penjumlahan Matriks 3x3\"\n"
                        + "Sembarangangka untuk Keluar\nPilih = ");
            opsi1=masuk.nextInt();
            switch(opsi1) {
                case 1:
                while(wh2==1) {
                    Teman obj = new Teman();
                    System.out.println("Program Tiga Teman Dekat");
                    System.out.print("1. Input || 2. Print Data ||"
                                    + " Sembarang. Exit\nPilih = ");
                    opsi2=masuk.nextInt();
                    switch(opsi2) {
                        case 1:
                            obj.input(nama);
                            break;
                        case 2:
                            obj.tampil(nama);
                            break;
                        default:
                            System.exit(0);
                            break;
                    }
                }    
                break;
                case 2:
                    System.out.println("Program Penjumlahan Matriks 3x3");
                    Matriks obj = new Matriks();
                    obj.matriks();
                    break;
                default:
                    System.exit(0);
                    break;                
            }
        }
    } 
}
