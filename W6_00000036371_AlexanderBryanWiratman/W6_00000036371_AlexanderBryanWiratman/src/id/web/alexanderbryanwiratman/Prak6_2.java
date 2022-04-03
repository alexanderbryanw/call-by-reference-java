package id.web.alexanderbryanwiratman;
import java.util.Scanner;

public class Prak6_2 {

	public static void hitungRata(NewMahasiswa mhs1, NewMahasiswa mhs2, NewMahasiswa mhs3) {
		//hitung rata-rata IPK dari data 3 orang mahasiswa
			float ratarata = (mhs1.getIpk() + mhs2.getIpk() + mhs3.getIpk()) / 3;
		//cetak data 3 orang mahasiswa
			System.out.println("IPK mahasiswa 1 = " + mhs1.getIpk());
			System.out.println("IPK mahasiswa 2 = " + mhs3.getIpk());
			System.out.println("IPK mahasiswa 3 = " + mhs3.getIpk());
		//cetak rata-reta IPK
			System.out.printf("Rata-rata IPK mahasiswa = %.2f", ratarata);
	}
	public static void main(String[] args) {
		//buat 3 objek mahasiswa
			Scanner scan = new Scanner (System.in);
		//assign masing-masing atribut dari objek mahasiswa dengan fungsi scanner
		//mhs1	
			NewMahasiswa mhs1 = new NewMahasiswa ();
			System.out.print("Nama: ");
			mhs1.setNama(scan.next());
			System.out.print("NIM: ");
			mhs1.setNim(scan.next());
			System.out.print("IPK: ");
			mhs1.setIpk(scan.nextFloat());
		//mhs2
			NewMahasiswa mhs2 = new NewMahasiswa ();
			System.out.print("Nama: ");
			mhs2.setNama(scan.next());
			System.out.print("NIM: ");
			mhs2.setNim(scan.next());
			System.out.print("IPK: ");
			mhs2.setIpk(scan.nextFloat());
		//mhs3
			NewMahasiswa mhs3 = new NewMahasiswa ();
			System.out.print("Nama: ");
			mhs3.setNama(scan.next());
			System.out.print("NIM: ");
			mhs3.setNim(scan.next());
			System.out.print("IPK: ");
			mhs3.setIpk(scan.nextFloat());
		//panggil kelas hitungRata
			hitungRata (mhs1, mhs2, mhs3);
	}

}
