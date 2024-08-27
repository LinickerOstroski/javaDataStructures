package com.linicker.estruturadados.fila.teste;

import com.linicker.estruturadados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileira(2);
		fila.enfileira(4);
		
		System.out.println(fila.espiar());
		
	}

}
