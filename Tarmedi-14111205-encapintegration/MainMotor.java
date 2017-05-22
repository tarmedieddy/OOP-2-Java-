public class MainMotor{
	public static void main(String args[]){
		motor data = new motor("Hitam","Honda","Blade Absolute");
		System.out.println("Warna  : " +data.warna);
		System.out.println("Merk   : " +data.getmerk());
		System.out.println("Type   : " +data.gettype());
	}
}