
public class Week2Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int age = 14;
	
	System.out.println(age >= 16);
	
	age = 18; 
	System.out.println(age >= 16);
	
	boolean hasLicense = true; 

	if (age >= 16 && hasLicense) {
		System.out.println("You can drive!");
	}	else {
	System.out.println("You cannot drive.");	
	}
	
	age = 11;
	if (age >= 16) {
		System.out.println("You can drive!");
	}	else {
	System.out.println("You cannot drive.");	
	}
	
	double costOfMilk = 3.50;
	int thirstLevel = 5;
	
	if (costOfMilk < 2.50 || thirstLevel > 6) {
		System.out.println("Milk please!");
	} else {
		System.out.println("No thanks.");
	  }
	int numberOfCookies = 5;
	int numberOfChildren = 2;
	
	if (numberOfCookies % numberOfChildren == 0) {
		System.out.println("Sad Face");
	 } else if (numberOfCookies % numberOfChildren < 2) {
		System.out.println("Yes!");
	}else if (numberOfCookies % numberOfChildren < 5) {
		System.out.println("Whoooohoooo!");
	}else if (numberOfCookies % numberOfChildren > 5) {
		System.out.println("Jackpot!");
	// Video 2 below
	}
	
	String loyaltyMemberStatus = "SILVER";
	double loyaltyMemberDiscount = 0.0; 
	
	switch(loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = .1;
			break;
		case "GOLD":
			loyaltyMemberDiscount = .15;
			break;
		case "PLATINUM":
			loyaltyMemberDiscount= .25;
		break;
	}
	
	double billTotal = 1003.45;
	double adjustedTotal = billTotal - billTotal * loyaltyMemberDiscount;
	
	System.out.println(adjustedTotal);
	
	if (adjustedTotal > 500) { 
		if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
		}else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
		}
	}
		System.out.println(loyaltyMemberStatus);
	
	String username = "Tommy123";
	String password = "12345";
	
		if (username.equals("Tommy123") && password.equals("12345")) {
				System.out.println("Login Successful!");
		}else {
			System.out.println("Access Denied.");
		}
		
		for (int i = 0; i<10; i++)
			System.out.println(i);
		
		for (int k = 10; k > -1; k--)
			System.out.println(k);
		
		for (int l = 0; l <= 100; l++)
			if (l % 2 ==0) {
				System.out.println(l);}
		
		for (int g = 0; g <= 100; g++)
			if (g % 2 == 0) {
				System.out.println(g + ", EVEN");
			}else {
				System.out.println(g + ", ODD");
			}
		int i = 100;
		while(i > 0) {
			System.out.println(i + " " + (i % 3));
			i--; 
		}
		
		}
}
	
	
	
