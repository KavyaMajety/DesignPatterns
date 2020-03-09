package facademethod;

public class CandySeller {
	private CandyShop godiva;
	private CandyShop dairymilk;
	
	public CandySeller() {
		godiva = new GodivaDarkChocolate();
		dairymilk = new CadburyDairyMilk();
	}
	
	public void godivaSale() {
		godiva.candyType();
		godiva.netWeight();
		godiva.price();
	}
	
	public void dairymilkSale() {
		dairymilk.candyType();
		dairymilk.netWeight();
		dairymilk.price();
	}
}
