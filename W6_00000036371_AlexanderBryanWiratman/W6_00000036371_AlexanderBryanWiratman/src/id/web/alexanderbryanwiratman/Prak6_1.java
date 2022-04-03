package id.web.alexanderbryanwiratman;
import java.util.Scanner;


public class Prak6_1 {

	public static void hitungRata(Mahasiswa mhs1, Mahasiswa mhs2,Mahasiswa mhs3) {
		//hitung rata-rata IPK dari data 3 orang mahasiswa
			float ratarata = (mhs1.ipk + mhs2.ipk + mhs3.ipk) / 3;
		//cetak data 3 orang mahasiswa
			System.out.println("IPK mahasiswa 1 = " + mhs1.ipk);
			System.out.println("IPK mahasiswa 2 = " + mhs3.ipk);
			System.out.println("IPK mahasiswa 3 = " + mhs3.ipk);
		//cetak rata-reta IPK
			System.out.printf("Rata-rata IPK mahasiswa = %.2f", ratarata);
	}
	public static void main(String[] args) {
		//buat 3 objek mahasiswa
			Scanner scan = new Scanner (System.in);
		//assign masing-masing atribut dari objek mahasiswa dengan fungsi scanner
		//mhs1	
			Mahasiswa mhs1 = new Mahasiswa ();
			System.out.print("Nama: ");
			mhs1.nama = scan.next();
			System.out.print("NIM: ");
			mhs1.nim = scan.next();
			System.out.print("IPK: ");
			mhs1.ipk = scan.nextFloat();
		//mhs2
			Mahasiswa mhs2 = new Mahasiswa ();
			System.out.print("Nama: ");
			mhs2.nama = scan.next();
			System.out.print("NIM: ");
			mhs2.nim = scan.next();
			System.out.print("IPK: ");
			mhs2.ipk = scan.nextFloat();
		//mhs3
			Mahasiswa mhs3 = new Mahasiswa ();
			System.out.print("Nama: ");
			mhs3.nama = scan.next();
			System.out.print("NIM: ");
			mhs3.nim = scan.next();
			System.out.print("IPK: ");
			mhs3.ipk = scan.nextFloat();
		//panggil kelas hitungRata
			hitungRata (mhs1, mhs2, mhs3);
	}

}
