package com.linicker.estruturadados.pilha.teste;

import com.linicker.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		Pilha<Integer>pilha = new Pilha<Integer>();
		
		
		pilha.empilha(1);
		pilha.empilha(2);
		System.out.println(pilha.toString());
		System.out.println(pilha.topo());
		
	}

}
