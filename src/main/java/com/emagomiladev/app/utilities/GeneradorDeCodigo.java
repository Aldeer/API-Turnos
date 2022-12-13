package com.emagomiladev.app.utilities;

import java.util.Random;

public class GeneradorDeCodigo {

	private final static String CARACTERES = "abcdefghxyz1234567";

	public static String generar() {
		String clave = "";
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int randomInt = random.nextInt(CARACTERES.length());
			char randomChar = CARACTERES.charAt(randomInt);
			clave += randomChar;
		}
		return clave;
	}
}
