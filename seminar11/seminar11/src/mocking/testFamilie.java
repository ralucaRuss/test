package mocking;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;
//am facut importul static pentru a folsoiti metodele fara a mai pune numele clasei
import sem11.Familie;
import sem11.Persoana;

public class testFamilie extends  TestCase {
	public testFamilie(String nume){
		super(nume);
	}
	
	Familie familie ;
	Persoana sot;
	Persoana sotie;
	@Before
	public void setUp() throws Exception {
		familie = new Familie();
		/*sot = new Persoana("Andrei", "1938282736438");
		sotie = new Persoana("Ralu", "2938282736438");*/
		sot = mock(Persoana.class);
		sotie = mock(Persoana.class);
		
		when(sot.getVarsta()).thenAnswer(new Answer<Integer>() {

			@Override
			public Integer answer(InvocationOnMock invocation) throws Throwable {
				return 20;
			}
			//metoda in care pot sa fac anumite procesari
		});
		when(sotie.getVarsta()).thenReturn(22);
		when(sot.getSex()).thenReturn("M");
		when(sotie.getSex()).thenReturn("F");
		familie.setSot(sot);
		familie.setSotie(sotie);	
	}

	@Test
	public void testCheckFamilie() {
		assertTrue("checkFamilie",familie.checkFamilie());
	}
	
	@Test
	public void testDiferenta() {
		assertEquals("getVarsta",2,familie.diferenta());
	}
	
	public static void main(String [] args){
		TestSuite testSuite = new TestSuite();
		testSuite.addTest(new testFamilie("testCheckFamilie"));
		TestRunner.run(testSuite);
	}

}
