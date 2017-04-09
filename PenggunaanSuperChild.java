public class PenggunaanSuperChild extends PenggunaanSuper{
	int num= 10;
	public void	tampilkan(){
		System.out.println("Ini tampilan dari SuperChild");
	}
	
	public void PenggunaanSuper(){
		tampilkan();
		super.tampilkan();
		System.out.println("Nilai dari variables num pada Sub kelas " + num);
		System.out.println("Nilai dari variables num pada Super kelas " + super.num);
	}
	
	public static void main(String args[]){
		PenggunaanSuperChild obj = new PenggunaanSuperChild();
		obj.PenggunaanSuper();
	} 
}