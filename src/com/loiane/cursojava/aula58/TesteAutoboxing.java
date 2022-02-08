package com.loiane.cursojava.aula58;

public class TesteAutoboxing {

	public static void main (String [] args) {
		
		//auto boxing
		Short num7 = 10;
		Byte num8 = 100;
		Integer num9 = 100;
		Long num10 = 1000l;
		Float num11 = 3.5f;
		Double num12 = 3.5555;
		Boolean flag2 = true;
		Character b = 'b';
		
		// auto un-boxing
		int num13 = num9;
		
		num9++;
		
		System.out.println(num9);
		
		//primeiro faz o auto un-boxing do num9, objeto para tipo primitivo.Depois faz um autoboxing transformando
		//tipo primitivo em objeto.
		Integer num14 = num13/num9;
		
	}
}
