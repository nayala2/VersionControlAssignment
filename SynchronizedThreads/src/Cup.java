
public class Cup {

	private int coffee;

	public Cup(int coffee){
		this.coffee = coffee;
	}
	
	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	synchronized public void drink() {
		int localCoffee = coffee;
		
		localCoffee--;
		System.out.println(" Sip ");
		
		try {
			Thread.sleep((long) (100 * Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		coffee = localCoffee;
	}
	
	synchronized public void pour() {
		int localCoffee = coffee;
		localCoffee++;
		System.out.println(" pour ");
		
		try {
			Thread.sleep((long) (100 * Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		coffee = localCoffee;
	}
}
