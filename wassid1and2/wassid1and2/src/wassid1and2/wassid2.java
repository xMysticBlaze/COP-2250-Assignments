package wassid1and2;
/*
 * Abdul Wassid 0256642
 */
import java.util.*;
import java.math.BigDecimal;
public class wassid2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int bill;
		int pay;
		int cents;
		int value;
		System.out.println("Enter the total cost of the purchase");
		bill = (int)(input.nextDouble() * 100);
		System.out.println("Enter the amount of money given to the clerk.");
		pay = (int)(input.nextDouble() * 100);
		cents = pay - bill;
		System.out.println("Change returned -");
		value = (cents / 100) % 100;
		System.out.println("Dollars: " + value);
		value = (cents % 100) / 25;
		System.out.println("Quarters: " + value);
		value = (cents % 25) / 10;
		System.out.println("Dimes: " + value);
		value = ((cents % 25) % 10) / 5;
		System.out.println("Nickels: " + value);
		value = (((cents % 25) % 10) % 5);
		System.out.println("Pennies: " + value);
		value = cents;
	}
}