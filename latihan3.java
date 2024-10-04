import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        String merk, kategori;
        int ukuran, harga;

        System.out.println("========================================");
        System.out.println("Masukkan merk (converse/skatcher/nike): ");
        merk = input09.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Masukkan kategori");
        System.out.println("converse    = slip on/hightop");
        System.out.println("skatcher    = woman/man");
        System.out.println("nike        = kids/adult");
        System.out.println("----------------------------------------");
        System.out.print("Kategori = ");
        kategori = input09.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Masukkan ukuran");
        System.out.println("slip on    = 36 - 40");
        System.out.println("high top   = 40 - 44");
        System.out.println("woman      = 36 - 41");
        System.out.println("man        = 41 - 44");
        System.out.println("kids       = 36 - 40");
        System.out.println("adult      = 40 - 44");
        System.out.println("----------------------------------------");
        System.out.print("Ukuran     = ");
        ukuran = input09.nextInt();
        System.out.println("========================================");

        if (merk.equals("converse")){
            if (kategori.equals("slip on")) {
                if (ukuran >= 36){
                    if (ukuran <=40) {
                        harga = 800000;
                        System.out.println("Harga = " + harga);
                    }
                } 
            }else if (kategori.equals("high top")) {
                if (ukuran >= 40){
                    if (ukuran <= 44) {
                        harga = 1200000;
                        System.out.println("Harga = " + harga);
                    }
                } 
            }
        } else if (merk.equals("skatcher")) {
            if (kategori.equals("woman")) {
                if (ukuran >= 36){
                    if (ukuran <=41) {
                        harga = 1000000;
                        System.out.println("Harga = " + harga);
                    }
                } 
            }else if (kategori.equals("man")) {
                if (ukuran >= 41){
                    if (ukuran <= 44) {
                        harga = 1800000;
                        System.out.println("Harga = " + harga);
                    }
                } 
            }
        } else if (merk.equals("nike")) {
            if (kategori.equals("kids")) {
                if (ukuran >= 36){
                    if (ukuran <= 40) {
                        harga = 750000;
                        System.out.println("Harga = " + harga);
                    }
                } 
            }else if (kategori.equals("adult")) {
                if (ukuran >= 40){
                    if (ukuran <= 44) {
                        harga = 1500000;
                        System.out.println("Harga = " + harga);
                    }
                } 
            }
        }
    }
}
