import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Jarak Kurang atau sama dengan 10 km = Rp 4250 per kg");
        System.out.println("Jarak lebih dari 10 km = Rp 6000 per kg");
        System.out.println("Paket akan dikenakan tambahan biaya Rp 50.000. ketika volume melebihi 100 cm^3");
        System.out.println("=========================");

        int jarak, berat, volume, Panjang, Lebar, Tinggi, hasil = 0;

        System.out.print("Masukkan Jarak Paket : ");
        jarak = input.nextInt();
        System.out.print("Masukkan Berat Paket : ");
        berat = input.nextInt();
        
        //Volume Paket
        System.out.println("Masukkan Panjang, Lebar, Tinggi Paket");
        System.out.print("Panjang   : ");
        Panjang = input.nextInt();
        System.out.print("Lebar     : ");
        Lebar = input.nextInt();
        System.out.print("Tinggi    : ");
        Tinggi = input.nextInt();
        //Hitung Volume
        volume = Panjang * Lebar * Tinggi;
        System.out.print("Volume Paket anda adalah : " + volume + " cm^3");
        System.out.println();

        if (jarak < 10 || jarak == 10){
            hasil += (4250 * berat);
        } else if (jarak > 10){
            hasil +=(6000 * berat);
        }
        if (volume > 100){
            hasil += 50000;
        } else {
            hasil += 0;
        }

        System.out.println("========================");
        System.out.println("Total Anda : Rp " + hasil);
    }
}
