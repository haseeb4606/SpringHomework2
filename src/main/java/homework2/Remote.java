package homework2;

public class Remote {
	
	private Tv t;
	
	public  void trunOnTv() {
		
		System.out.println(" Dont worry TV I will make you work now ");
		
		t.dependent();
	}

	public Tv getT() {
		return t;
	}

	public void setT(Tv t) {
		this.t = t;
	}

	
}
