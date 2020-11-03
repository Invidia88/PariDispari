package it.unical.PariDispari;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratorePariDispariTest {
		
		private static GeneratorePAriDispari generatore;
		
		@Before
		public static void init() {
			System.out.println("Before");
			generatore = new GeneratorePAriDispari();		
			
		}

		@Test
		public void primeNumbersGeneratorWorks() {
			assertEquals(Arrays.asList(0, 2, 4, 6, 8), generatore.GeneratorePD("pari", 8));
			assertEquals(Arrays.asList(1, 3, 5, 7), generatore.GeneratorePD("dispari", 8));
		}

}


