//Nama  : Tarmedi
//Kelas : TIF W14

class motor{
	//Atribut class pada motor{
	String warna;
	String merk;
	String type;
	int tahun;
	
	void hidupkanMesin(){
		System.out.println("Mesin Motor Hidup");
	}
	
	void maju(){
		System.out.println("Motor Maju");
	}
	
	void berhenti(){
		System.out.println("Motor Berhenti");
	}
	
	public static void main(String[] args){
		//Method class Kendaraan Motor
		motor MotorEddy=new motor(); //Kelas yang Dibuat
		MotorEddy.warna="Hitam"; //Memakai data warna
		MotorEddy.merk="Honda Blade"; //Memakai data Merk
		MotorEddy.type="Motor Bebek"; //Memakai data Type
		MotorEddy.tahun=2010; //Memakai data Type
		
		System.out.println("e-Learning 1");
		System.out.println("Tarmedi - TIF W14");
		System.out.println(" ");
		System.out.println("Spesifikasi Motor");
		System.out.println("Warna Motor    : " + MotorEddy.warna);
		System.out.println("Merk Motor     : " + MotorEddy.merk);
		System.out.println("Type Motor     : " + MotorEddy.type);
		System.out.println("Tahun Produksi : " + MotorEddy.tahun);
		System.out.println(" ");	
		System.out.println("Metode Motor : ");
		
		//Memanggil method hidupkan mesin
		MotorEddy.hidupkanMesin();
		//Memanggil Method Maju
		MotorEddy.maju();
		//Memanggil Method berhenti
		MotorEddy.berhenti();
	}
}