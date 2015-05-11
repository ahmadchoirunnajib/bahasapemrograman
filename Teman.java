package array5214057;
import java.util.*;
public class Teman {
    public static void input(String [] nama) {
        Scanner masuk = new Scanner(System.in);
        for (int i=0;i<nama.length;i++) {
            System.out.print("Masukkan nama teman ke "+(i+1)+" Anda = ");
            nama[i]=masuk.nextLine();
        }
    }
    public static void tampil(String[] nama) {
        System.out.print("Nama Teman Dekat Anda adalah ");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i]+" ");
        }
        System.out.println("");
        
    }
}
