package ps3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Text {

	Account c;
	
	@Before
	public void setUp() throws Exception {
		c = new Account(1122,20000);
		c.setAnnualInterestRate(0.045);
		c.getDateCreated();
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		c.withdraw(2500.00);
		assertEquals("you wtihdraw $2,500, you account have 17,500 balance",(long)c.getBalance(),(long)17,500.00);

	}

	@Test
	public final void testDeposit() throws InsufficientFundsException {
        c.deposit(3000.00);
        assertEquals("you saved $3000, you account have 23000 balance",(long)c.getBalance(),(long)23,000.00);
	}
	@Test
	public final void testPrintout() {
		System.out.print("Balance is equal to $"+ c.getBalance());
		System.out.print("Monthly Interest Rate is equal to $"+ c.getMonthlyInterestRate()+"%");
		System.out.print("Account created on"+ c.getDateCreated());
		assertEquals("Balance is equal to $20000", "Balance is equal to $" + c.getBalance());
		assertEquals("Monthly Interest Rate is equal to 0.375%", "Monthly Interest Rate is equal to "+ c.getMonthlyInterestRate() + "%");
		assertEquals("Account created on " + c.getDateCreated(),"Account created on " + c.getDateCreated());
	}
}

