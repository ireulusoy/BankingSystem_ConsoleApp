package banking;
import java.util.Scanner;



public class TestClass { 
	
	
	public static void main(String[] args) {
		
	
		String acco;
		int amo;
		
		BankingSystem a123 = new BankingSystem("Ali", 123);
		BankingSystem a234 = new BankingSystem("Emre", 234);
		BankingSystem a345 = new BankingSystem("Nilüfer", 345);
		BankingSystem a456 = new BankingSystem("Sinem", 456);
		BankingSystem a567 = new BankingSystem("Aslı", 567);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("---ERP SYSTEM IN BANKING---");

		System.out.println(
				"\nSELECT OPERATOR:\n1) Display account list\n2) Make operations\n3) EXIT\n");
		String choice = sc.next();

		while (true) {
			if (choice.equals("1")) {
				System.out.println("Account List is as follow:");
				BankingSystem.displayAllAcc();
				break;
			} else if (choice.equals("2")) {
				System.out.println("Select the account you want to make operations (enter the iban by putting letter 'a' in front, example: a123. So, before choosing this option, please check the account list)");
				acco = sc.next();
				System.out.println(
						"\nSELECT THE OPERATION TYPE:\n1) Delete the account\n2) Display account info \n3) Deposit money \n4) Withdraw money \n5) EXIT\n");
				choice = sc.next();
					if (choice.equals("1")) {
						
						if(acco.equals("a123"))
						{
							a123.deleteAcc();
							System.out.println("123 is deleted successfully.");
						}
						else if(acco.equals("a234"))
						{
							a234.deleteAcc();
							System.out.println("234 is deleted successfully.");
						}
							
						else if(acco.equals("a345"))
						{
							a345.deleteAcc();
							System.out.println("345 is deleted successfully.");
						}
							
						else if(acco.equals("a456"))
						{
							a456.deleteAcc();
							System.out.println("456 is deleted successfully.");
						}
							
						else if(acco.equals("a567"))
						{
							a567.deleteAcc();
							System.out.println("567 is deleted successfully.");
						}
						else
							System.out.println("invalid account, please check account list");						
						break;
						
						
					} else if (choice.equals("2")) {
						if(acco.equals("a123"))
						{
							System.out.println("Account info is as follows:");
							a123.displayInfo();
						}
						else if(acco.equals("a234"))
						{
							System.out.println("Account info is as follows:");
							a234.displayInfo();
						}
							
						else if(acco.equals("a345"))
						{
							System.out.println("Account info is as follows:");
							a345.displayInfo();
						}
							
						else if(acco.equals("a456"))
						{
							System.out.println("Account info is as follows:");
							a456.displayInfo();
						}
							
						else if(acco.equals("a567"))
						{
							System.out.println("Account info is as follows:");
							a567.displayInfo();
						}
						else
							System.out.println("invalid account, please check account list");						
						break;
					} else if (choice.equals("3")) {
						System.out.print("Enter the amount you want to deposit: ");
						amo = sc.nextInt();
						
						
						if(acco.equals("a123"))
						{
							a123.deposit(amo);
							System.out.println("current status: ");
							a123.displayInfo();
						}
							
						else if(acco.equals("a234"))
						{
							a234.deposit(amo);
							System.out.println("current status: ");
							a234.displayInfo();
						}
							
						else if(acco.equals("a345"))
						{
							a345.deposit(amo);
							System.out.println("current status: ");
							a345.displayInfo();
						}
							
						else if(acco.equals("a456"))
						{
							a456.deposit(amo);
							System.out.println("current status: ");
							a456.displayInfo();
						}
							
						else if(acco.equals("a567"))
						{
							a567.deposit(amo);
							System.out.println("current status: ");
							a567.displayInfo();
						}
							
						break;
					} else if (choice.equals("4")) {
						System.out.print("Enter the amount you want to withdraw: ");
						amo = sc.nextInt();
						
						if(acco.equals("a123"))
							a123.withdraw(amo);
						else if(acco.equals("a234"))
							a234.withdraw(amo);
						else if(acco.equals("a345"))
							a345.withdraw(amo);
						else if(acco.equals("a456"))
							a456.withdraw(amo);
						else if(acco.equals("a567"))
							a567.withdraw(amo);
						break;
					}
					else if (choice.equals("5")) {
						System.out.println("Program terminated.");
						break;
					}
					
				
			} else if (choice.equals("3")) {
				System.out.println("Program terminated.");
				break;
			} else {
				System.out.println("INVALID OPERATOR! Please try again and select a valid operator:");
				System.out.println(
						"\\nSELECT THE OPERATION TYPE:\\n1) Delete the account\\n2) Display account info \\n3) Deposit money \\n4) Withdraw money \\n5) EXIT\\n");
				choice = sc.next();
				continue;
			}
			
		}
		
	}

}
