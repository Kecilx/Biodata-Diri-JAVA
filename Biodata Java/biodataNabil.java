import java.util.Scanner;

public class biodataNabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        //meminta keterangan
        System.out.print("Masukkan NIS : ");
        String nis = scanner.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin : ");
        String gender = scanner.nextLine();
        System.out.print("Masukkan Agama : ");
        String agama = scanner.nextLine();

        scanner.close();

         //tampilan biodata
        System.out.println("                                             ");
        System.out.println("                                             ");
        System.out.println("|=============================|");
        System.out.println("|        BIODATA Diri         | ");
        System.out.println("|=============================|");
        System.out.println(" NIS : " + nis);     
        System.out.println(" Nama : " + nama);
        System.out.println(" Jenis Kelamin : " + gender);
        System.out.println(" Agama : " + agama); 
        System.out.println("                                             ");
        System.out.println("                                             ");
    }
}