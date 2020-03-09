package factorymethod;

public abstract class InternetPlan {
	protected static double cost;
	
	abstract void getPlanRate();
	
	public static double getCost(double dataConsumed) {
		return cost * dataConsumed;
	}

	public InternetPlan() {
		
	}

}
