package Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Data login
        String username = "Axelle";
        String password = "12345";

        System.out.println("===== SELAMAT DATANG DI APLIKASI TIKET ONLINE =====");
        System.out.print("Masukkan username: ");
        String inputUser = br.readLine();
        System.out.print("Masukkan password: ");
        String inputPass = br.readLine();

        if (inputUser.equals(username) && inputPass.equals(password)) {
            double hargaPesawat, hargaHotel;
            int jmlPenumpang, jmlKamar;

            System.out.print("Masukkan harga tiket pesawat: ");
            hargaPesawat = Double.parseDouble(br.readLine());
            System.out.print("Masukkan jumlah penumpang: ");
            jmlPenumpang = Integer.parseInt(br.readLine());
            System.out.print("Masukkan harga kamar hotel: ");
            hargaHotel = Double.parseDouble(br.readLine());
            System.out.print("Masukkan jumlah kamar: ");
            jmlKamar = Integer.parseInt(br.readLine());

            double hargaTiket = hargaPesawat * jmlPenumpang;
            double asuransiPenumpang = jmlPenumpang * 29000;
            double totalBiayaPesawat = hargaTiket + asuransiPenumpang;

            double diskonTiket = 0.45 * hargaHotel;
            double totalBiayaHotel = (hargaHotel - diskonTiket) * jmlKamar;

            System.out.println("Total Harga Tiket Pesawat: " + totalBiayaPesawat);
            System.out.println("Total Biaya Kamar Hotel: " + totalBiayaHotel);
        } else {
            System.out.println("Login gagal! Username atau Password yang anda masukkan salah!");
        }
    }
}
