package com.linicker.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		fila.add(1);
		
		System.out.println(fila);
		
		fila.add(2);
		
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);
		
		
	}

}
