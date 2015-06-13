package ro.ase.csie.cts.test;

import ro.ase.csie.cts.AccountException;
import ro.ase.csie.cts.BankAccount;
import ro.ase.csie.cts.FloatingValueException;
import ro.ase.csie.cts.NegativeAmountException;
import ro.ase.csie.cts.ZeroAmountException;
import junit.framework.TestCase;

public class TestBankAccount extends TestCase {
	
	//definire preconditii - Fixture
	BankAccount account;
	
	public void setUp(){
		System.out.println("setUp Unit test");
		account = new BankAccount(100.0, 5000.0, 10.0);
	}
	
	//unit test pentru verificat metoda deposit()
	//testare valori normale (intregi > 0)
	public void testNormalValuesDeposit() 
			throws NegativeAmountException, ZeroAmountException, FloatingValueException{
		//definire valori
		double expected = 300;
		account.deposit(200.0);
		assertEquals("Test deposit() cu valori normale",
				300.0,
				account.getBalance(),
				0.0);
	}
	
	//unit test pentru verificat metoda deposit()
	//testare valori negative (< 0)
	public void testNegativeValuesDeposit(){
		try{
		account.deposit(-200.0);
		assertFalse("Metoda nu arunca exceptie pe valori negative", true);
		}
		catch(AccountException ex){
			assertTrue(true);
		}
	}
	
	//unit test pentru verificat metoda deposit()
	//testare valori nule (= 0)
	public void testZeroValueDeposit(){
		try{
		account.deposit(0.0);
		assertFalse("Metoda deposit() nu arunca exceptie pe 0", true);
		}
		catch(AccountException ex){
			assertTrue(true);
		}
	}
	
	//unit test pentru verificat metoda deposit()
	//testare valori pozitive cu maxim 2 zecimale (> 0)
	public void testFloatingValueDeposit(){
		try{
		account.deposit(0.0006);
		assertFalse("Metoda deposit() nu arunca exceptie pe 0", true);
		}
		catch(AccountException ex){
			assertTrue(true);
		}
	}
}
