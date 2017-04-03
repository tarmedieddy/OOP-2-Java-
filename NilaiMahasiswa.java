// Nama  : Tarmedi
// Kelas : TIF W14
import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args){

        //Inisialisasi
        Scanner input = new Scanner(System.in);
        int m,jml,nLulus=0, nTLulus=0;
		double rata,nilai=0,jumlah=0,lulus;
               
        //Input jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        
		m = input.nextInt();
        //Inisialisasi array
        double []nilaiIP = new double[m];
        
        //Input nilaiIP
        for(int i=0;i<= m-1;i++){       
            System.out.print("Nilai IP Mahasiswa " + (i+1) + " : ");
            nilaiIP[i] = input.nextDouble();
            System.out.println();
        }
        
        //Hitung Jumlah
        for(int j=0;j<= m-1;j++){
            jumlah = jumlah + nilaiIP[j];
        }
        
        //Hitung Rata-rata
        rata = jumlah/m;
		nilai = nilaiIP[0];
        //nilaiIP Maksimal
        lulus = 2.75;
        
        //Cek Lulus Tdk nya Mahasiswa
        for(int k=0;k<= m-1;k++){
            if(nilaiIP[k] >= lulus){
                nLulus = nLulus+1;
            }else{
				nTLulus = nTLulus+1;
			}
        }
        
        //Output
        System.out.println("Daftar Nilai IP Mahasiswa");
        System.out.println("----------------");
        System.out.println("Nilai rata-rata Mahasiswa : " + rata);
        System.out.println("Mahasiswa Lulus = " + nLulus);
        System.out.println("Mahasiswa Tidak Lulus = " + nTLulus);
    }
}