package inter;

public class Dell_gaming implements Interface_test{

	@Override
	public void name() {
		System.out.println("Alienware gaming computer");
		
	}

	@Override
	public void cpu() {
		System.out.println("Intel® Core™ i5-9600K");
		
	}

	@Override
	public void ram() {
		System.out.println("16GB DDR4 RAM");
		
	}

	@Override
	public void grafic() {
		System.out.println("NVIDIA® GeForce® RTX 2070 8GB");
		
	}

}
