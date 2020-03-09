package factorymethod;

public class GetInternetPlanFactory {
	
	public static InternetPlan getInternetPlan(String plan) {
		
		if(plan.equalsIgnoreCase("Airtel")) {
			return new Airtel();
		} else if(plan.equalsIgnoreCase("Hathway")) {
			return new Hathway();
		} else if(plan.equalsIgnoreCase("ACTFibernet")) {
			return new ACTFibernet();
		} else {
			return null;
		}
	}

}
