import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        
        String jenis;
        int jumlah, harga;
        double hargaDiskon, diskon, jumlahDiskon;
        
        System.out.println("Masukkan jenis buku: ");
        jenis = input09.nextLine();
        System.out.println("Masukkan jumlah buku: ");
        jumlah = input09.nextInt();
        System.out.println("Masukkan harga buku: ");
        harga = input09.nextInt();
        
        if (jenis.equals("kamus")){
            diskon = (1.0 - 0.1) * jumlah * harga;
            if (jumlah > 2){
                hargaDiskon = (1.0 - 0.02) * diskon;
            } else {
                hargaDiskon = (diskon);
            }
       } else if (jenis.equals("novel")){
            diskon = (1.0 - 0.07) * jumlah * harga;
            if (jumlah > 3){
                hargaDiskon = (1.0 - 0.02) * diskon;
            } else {
                hargaDiskon = (1.0 - 0.01) * diskon;
            }
            
        } else {
            if (jumlah > 3){
                hargaDiskon = (1.0 - 0.05) * harga * jumlah;
            } else {
                hargaDiskon = 0;
            }        
        }   
        System.out.println("Total harga setelah diskon: " + hargaDiskon);
        jumlahDiskon = (harga * jumlah) - hargaDiskon;
        System.out.println("jumlah diskon (Rp): " + jumlahDiskon);
    }
}