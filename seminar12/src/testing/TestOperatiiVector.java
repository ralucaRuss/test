package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

import clase.OperatiiVector;

public class TestOperatiiVector {
	ArrayList<Integer> vector;

	@Before
	public void setUp() throws Exception {
		vector = new ArrayList<Integer>();
		vector.add(new Integer(1));
		vector.add(new Integer(10));
		vector.add(new Integer(7));
		vector.add(new Integer(232323));
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorPositiveValue() {
		OperatiiVector operatiiVector = new OperatiiVector(vector);
		assertEquals(vector, operatiiVector.getVector());
	}
	
	@Test
	public void testConstructorNull() {
			OperatiiVector operatiiVector = new OperatiiVector(null);
			assertEquals(null, operatiiVector.getVector());
	}
	
	@Test
	public void testConstructorEmpty() {
		ArrayList<Integer> vectorGol = new ArrayList<Integer>();
		OperatiiVector operatiiVector = new OperatiiVector(vectorGol);
		assertEquals(vectorGol, operatiiVector.getVector());
	}
	
	@Test
	public void testConstructorMaxValue() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(Integer.MAX_VALUE);
		vectorInteger.add(Integer.MAX_VALUE);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(vectorInteger, operatiiVector.getVector());
	}
	
	@Test
	public void testConstructorMinValue() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(Integer.MIN_VALUE);
		vectorInteger.add(Integer.MIN_VALUE);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(vectorInteger, operatiiVector.getVector());
	}
	
	@Test
	public void testConstructorNegativeValue() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(-23);
		vectorInteger.add(-8687123);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(vectorInteger, operatiiVector.getVector());
	}
	
	@Test
	public void testConstructorNeagPosValue() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(-23);
		vectorInteger.add(-8687123);
		vectorInteger.add(8687123);
		vectorInteger.add(12);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(vectorInteger, operatiiVector.getVector());
	}
	
	@Test
	public void testConstructorNullValue() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(null);
		vectorInteger.add(null);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(vectorInteger, operatiiVector.getVector());
	}
	
	@Test
	public void testSumaPositive() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(2);
		vectorInteger.add(5);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(7, operatiiVector.sumaElemente());
	}
	
	@Test
	public void testSumaNegative() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(-2);
		vectorInteger.add(-5);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(-7, operatiiVector.sumaElemente());
	}
	
	@Test
	public void testSumaNegPos() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(-2);
		vectorInteger.add(5);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(3, operatiiVector.sumaElemente());
	}
	
	@Test
	public void testSumaEmptyArray() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(0, operatiiVector.sumaElemente());
	}
	
	@Test
	public void testSumaNullArray() {
		OperatiiVector operatiiVector = new OperatiiVector(null);
		assertEquals(0, operatiiVector.sumaElemente());
	}
	
	@Test
	public void testSumaNullValue() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(null);
		vectorInteger.add(null);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(0, operatiiVector.sumaElemente());
	}
	
	@Test
	public void testMaxParPositive() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(2);
		vectorInteger.add(3);
		vectorInteger.add(13);
		vectorInteger.add(30);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(30, operatiiVector.maximPar());
	}
	
	@Test
	public void testMaxParNegative() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(-2);
		vectorInteger.add(-4);
		vectorInteger.add(-13);
		vectorInteger.add(-30);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(-2, operatiiVector.maximPar());
	}
	
	@Test
	public void testMaxParNegPos() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(-2);
		vectorInteger.add(4);
		vectorInteger.add(-13);
		vectorInteger.add(-30);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(4, operatiiVector.maximPar());
	}
	
	@Test
	public void testMaxParNullArray() {
		OperatiiVector operatiiVector = new OperatiiVector(null);
		try{
			operatiiVector.maximPar();
			fail();
		}catch(Exception e){
		}
	}
	
	@Test
	public void testMaxParNullValueArray() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(null);
		vectorInteger.add(null);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		try{
			operatiiVector.maximPar();
			fail();
		}catch(NullPointerException e){
		}
	}
	
	@Test
	public void testMinPositive() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(2);
		vectorInteger.add(3);
		vectorInteger.add(13);
		vectorInteger.add(30);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(2, operatiiVector.arrayMinimum());
	}
	
	@Test
	public void testMinNegative() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(-2);
		vectorInteger.add(-4);
		vectorInteger.add(-13);
		vectorInteger.add(-30);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(-30, operatiiVector.arrayMinimum());
	}
	
	@Test
	public void testMinParNegPos() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(-2);
		vectorInteger.add(4);
		vectorInteger.add(-13);
		vectorInteger.add(-30);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		assertEquals(-30, operatiiVector.arrayMinimum());
	}
	
	@Test
	public void testMinParNullArray() {
		OperatiiVector operatiiVector = new OperatiiVector(null);
		try{
			operatiiVector.arrayMinimum();
			fail();
		}catch(Exception e){
		}
	}
	
	@Test
	public void testMinParNullValueArray() {
		ArrayList<Integer> vectorInteger = new ArrayList<Integer>();
		vectorInteger.add(null);
		vectorInteger.add(null);
		OperatiiVector operatiiVector = new OperatiiVector(vectorInteger);
		try{
			operatiiVector.arrayMinimum();
			fail();
		}catch(NullPointerException e){
		}
	}

}
