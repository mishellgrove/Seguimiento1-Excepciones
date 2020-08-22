package model;
import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.IdNoMatchException;

public class MinimarketTest {
	
	private Minimarket myMiniMarket;
	
	private void setupScenary1(){
		myMiniMarket = new Minimarket();
	}

	@Test
	public void testAddPerson1() {
		setupScenary1();
		String type = "CC";
		int identification = 2587;
		try {
			myMiniMarket.addPerson(type, identification);
		} catch (IdNoMatchException idn){
			idn.printStackTrace();
		}
		assertEquals(1, myMiniMarket.getPeople().size());	
	}
	
	@Test
	public void testAddPerson2() {
		setupScenary1();
		String type = "TI";
		int identification = 1011;
		try {
			myMiniMarket.addPerson(type, identification);
		} catch (IdNoMatchException idn){
			idn.printStackTrace();
			fail ("no es posible agregarse, es menor de edad");
		}
		assertEquals(0, myMiniMarket.getPeople().size());
		
	}
	
	@Test
	public void testAddPerson3() {
		setupScenary1();
		String type = "CC";
		int identification = 1010;
		try {
			myMiniMarket.addPerson(type, identification);
		} catch (IdNoMatchException idn){
			idn.printStackTrace();
		}
		assertEquals(0, myMiniMarket.getPeople().size());
	}
	
	

}
