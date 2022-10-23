package app;

public class CashRegister {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		//Take a users input to take the amount owed and store it in a variable
		System.out.println("What is the total cost?");
		double cost = scanner.nextDouble();
	//Take a users input to take the amount paid and store it in a variable
		System.out.println("What amount will you be paying with?");
		double paid = scanner.nextDouble();
	//Calculate the difference and store it in the variable
		double change = paid - cost;
		
		if (change < 0) {
		System.out.println("ERROR!");
		}
		else if (paid == cost) {
		System.out.println("That was easy! Thanks for giving correct change.");
		}
		else {
			amountChange(change);
		}
	}
		
	//Find the amount of twenties owed as change, subtract that amount from the changeRemaining
		 public static void amountChange(double change) {
		 
		 
		 int twenties = (int)Math.floor(change/20);
		if(twenties > 1) {
			System.out.print(twenties + " twenties ");
		} else if(twenties == 1) {
			System.out.print(twenties + " twenty ");
		}
		change = (change - (twenties * 20));
	//Find the amount of tens owed as change, subtract that amount from the changeRemaining
		int tens = (int)Math.floor(change / 10);
		if(tens >= 1) {
			System.out.print("1 ten ");
		}
		change = (change - (10*tens));
	//Find the amount of fives owed as change, subtract that amount from the changeRemaining
		int fives = (int)Math.floor(change/5);
		if(fives >= 1 && fives < 5) {
			System.out.print("1 five ");
		}
		change = (change - (5*fives));
	//Find the amount of ones owed as change, subtract that amount from the changeRemaining
//NEEDS TO RESOLVE THE ONES
		int ones = (int)Math.floor(change);
		if(ones > 1 && ones < 5) {
			System.out.print(ones + " ones ");
		}
		else if(ones == 1) {	
			System.out.print("1 one ");
		}
		double changeRemainingDol = (change - ones);
		
		
		double changeRemainDec = (double) Math.round(changeRemainingDol * 100)/100;
		
		double changeRemainDec2 = changeRemainDec * 100;
	//Find the amount of quarters owed as change, subtract that amount from the changeRemaining
		int quarters = ((int)changeRemainDec2 /25);
		if(quarters > 1) {
			System.out.print(quarters + " quarters ");
		}
		else if (quarters == 1) {
			System.out.print("1 quarter ");
		}
		changeRemainDec2 = (changeRemainDec2 -(25* quarters));
	//Find the amount of dimes owed as change, subtract that amount from the changeRemaining
		int dimes = ((int)changeRemainDec2 / 10);
		if(dimes > 1) {
			System.out.print(dimes + " dimes ");
		}
		else if (dimes == 1) {
			System.out.print("1 dime ");
		}
		changeRemainDec2 = (changeRemainDec2 - (dimes * 10));
	//Find the amount of nickels owed as change, subtract that amount from the changeRemaining
		int nickels = ((int)changeRemainDec2 / 5);
		if(nickels > 1) {
			System.out.print(nickels + " nickels ");
		}
		else if (nickels == 1) {
			System.out.print("1 nickel ");
		}
		changeRemainDec2 = (changeRemainDec2 - (nickels * 5));
	//Find the amount of pennies owed as change, subtract that amount from the changeRemaining
		int pennies = (int)changeRemainDec2;
		if(pennies > 1) {
			System.out.print((pennies) + " pennies");
		}
		else if (pennies == 1) {
			System.out.print("1 penny");
		}
		//Print the result
		 }
		 }