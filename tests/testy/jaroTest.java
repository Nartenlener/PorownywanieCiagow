package testy;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.nartenlener.porownywanie;
public class jaroTest {

	@Test
	public void ifTheSameStringsGetEqualValue() throws Exception
	{
		//given
		String[] str =  {"Jakiœ ciekawy tekst", "Jakiœ ciekawy tekst"};
		
		//when
		double wynik = porownywanie.wynikPorownania(str);
		
		assertEquals(1, wynik, 0);
	}
	
	@Test
	public void ifNotTheSameStringsGetEqualValue() throws Exception
	{
		//given
		String[] str =  {"", "Jakiœ ciekawy tekst"};
		
		//when
		double wynik = porownywanie.wynikPorownania(str);
		
		assertEquals(0, wynik, 0);
	}


}
