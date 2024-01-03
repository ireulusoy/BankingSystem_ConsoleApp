package banking;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	BankingSystem account = new BankingSystem("İrem", 999);
	BankingSystem account2 = new BankingSystem("Ömer", 444);
	BankingSystem account3 = new BankingSystem("Arif", 222);


	@Test
	public void deposit_validAmount_shouldIncreaseTotal() {
        int initialTotal = Bst.getAccount(999).total;//0
        account.deposit(100);//deposited 100

        assertEquals(initialTotal + 100, Bst.getAccount(999).total);//must be 100
    }
	@Test
    public void deposit_negativeAmount_shouldNotChangeTotal() {
        int initialTotal = Bst.getAccount(222).total;
        account.deposit(-50);
        assertEquals(initialTotal, Bst.getAccount(222).total);//total must be remain unchanged
    }
	@Test
	public void withdraw_validAmount_shouldDecreaseTotal() {
		  account2.deposit(130);
	      int initialTotal = Bst.getAccount(444).total;//should be 130
	      account2.withdraw(50);//after withdrawing 50, 80 must be left
	      assertEquals(initialTotal - 50, Bst.getAccount(444).total);//80
	}
	@Test
	public void withdraw_amountGreaterThanTotal_shouldNotChangeTotal() {
	int initialTotal = Bst.getAccount(222).total;//0
	account.withdraw(initialTotal + 50);//trying to withdraw the current amount
	assertEquals(initialTotal, Bst.getAccount(222).total);//should be 0, unchanged
	}
	@Test
	public void displayInfoTest() {
		  	long ib = account3.acIban;
		  	String name = account3.acName;
		  	int totalMoney = account3.total;
		  	assertEquals(ib, Bst.getAccount(222).acIban);
		  	assertEquals(name, Bst.getAccount(222).acName);
		  	assertEquals(totalMoney, Bst.getAccount(222).total);
	}
	@Test
	    public void deleteAcc_existingAccount_shouldReturnTrue() {
	        Bst.insert(account.acName, account.acIban);
	        assertTrue(account.deleteAcc());//deleting the account and checking the return value
	}  
}
