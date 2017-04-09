class Hewan{
	public void makan(){
		System.out.println("Hewan Bisa Makan");
	}	
}

class Ayam extends Hewan{
	public void makan(){
		System.out.println("Ayam Bisa Makan");
		super.makan();
	}
}

public class MainAyam{
		public static void main(String args[]){
			Hewan Ayam = new Hewan();
			Ayam AyamKate = new Ayam();
			Ayam.makan();
			AyamKate.makan();
		}
}