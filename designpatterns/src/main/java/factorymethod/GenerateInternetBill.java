package factorymethod;

import java.util.Scanner;

public class GenerateInternetBill {

	public static void main(String[] args) {
		String providerName;
		double dataConsumed;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to internet bill generator!");
		System.out.println("Enter the name of the internet provider to generate the bill");
		providerName = scanner.next();
		System.out.println("Enter the data consumed this month in gigabytes:-");
		dataConsumed = scanner.nextDouble();
		InternetPlan internetplan = GetInternetPlanFactory.getInternetPlan(providerName);
		internetplan.getPlanRate();
		double billAmount = internetplan.getCost(dataConsumed);
		System.out.println("The total bill amount for "+providerName + "= " +billAmount + "Rupees");
		System.out.println("Thankyou for using the bill generator!");
	}

}
