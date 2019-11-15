package inter;

public class Main {
	public static void main(String[] args) {
		
		Interface_test[] inter = {new Acer_gaming(), new Asus_gaming(), new Dell_gaming()};
		
		for (Interface_test i : inter) {
			i.name();
			i.cpu();
			i.ram();
			i.grafic();
			System.out.println("");
		}
		
	}

}
