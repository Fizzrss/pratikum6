import java.util.Scanner;

public class Pemilihan2Percobaan209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String member, metodePembayaran;
        int pilihan_menu, harga;
        double diskon, total_bayar = 0;
        
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("-------------------------------------");
        
        if (member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10% ");
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
            } else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("total bayar setelah diskon = " + total_bayar);
            
        } else if (member.equalsIgnoreCase("n")){
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
            } else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga;
            System.out.println("total bayar = " + total_bayar);
            
        } else {
            System.out.println("member tidak valid");
        }
        System.out.println("---------------------------------------");
        
        // metode pembayaran
        System.out.println("Apakah metode pembayaran lewat QRIS (y/n) ? ");
        metodePembayaran = sc.nextLine();
        
        if (metodePembayaran.equalsIgnoreCase("y")){
            total_bayar -= 1000;
            System.out.println("anda mendapatkan potongan Rp. 1000");
        }
        System.out.println("total bayar = " + total_bayar);
        System.out.println("--------------------------------------");
    }
}
