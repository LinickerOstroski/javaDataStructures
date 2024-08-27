package com.linicker.estruturadados.pilha.teste;

import com.linicker.estruturadados.pilha.Pilha;

public class Aula17 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(4);
		
		System.out.println(pilha);
		
		pilha.desempilha();
		System.out.println(pilha);
		
	}

}
