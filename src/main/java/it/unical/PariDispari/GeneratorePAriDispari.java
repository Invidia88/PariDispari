package it.unical.PariDispari;

import java.util.LinkedList;
import java.util.List;

public class GeneratorePAriDispari {

	public List<Integer> GeneratorePD(String b, Integer n){
		List<Integer> lista = new LinkedList<Integer>();
		if(b.contains("pari")) {
			for(int i=0; i<n; i+=2)
				lista.add(i);
		}
		else {
			for(int i=1; i<n; i+=2)
				lista.add(i);
		}
		return lista;
	}
}
