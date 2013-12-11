package pl.nartenlener;

import java.util.Scanner;
import uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinkler;

public class porownywanie {
	public static final String jaroAlghoritm= "Jaro";
	public static String[] wpisane;
	public static Double wynik;
	static Scanner dane;
	
	public static void main(String[] args) {
		wpisane = new String[2];
		wpisane = pobieranieDanych();
		
		System.out.println("");
		
		System.out.println("Wynik: " + wynikPorownania(wpisane)*100 + "%");
		
	}
	
	public static String[] pobieranieDanych()
	{
		String[] ciagi = new String[2];
		dane = new Scanner(System.in);
		
		System.out.println("Podaj teraz pierwszy ci¹g znaków");
		ciagi[0] = dane.next();
		
		System.out.println("Podaj teraz drugi ci¹g znaków");
		ciagi[1] = dane.next();
		return ciagi;
	}
	
	public static double wynikPorownania(String[] dane)
	{
		 JaroWinkler jaroWinklerTest = new JaroWinkler();
	        return jaroWinklerTest.getSimilarity(dane[0], dane[1]);
	}

}
