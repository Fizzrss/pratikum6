import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int bil1 = 28, bil2 = 54, bil3 = 15;

        if (bil1>bil2){
            if (bil1>bil3){
                System.out.println("Bilangan terbesar = 28");
            } else {
                System.out.println("Bilangan terbesar = 15");
            }
        } else if (bil2>bil3) {
            System.out.println("Bilangan terbesar = 54");
        } else {
            System.out.println("Bilangan terbesar = 15");
        }
    }
    
}
