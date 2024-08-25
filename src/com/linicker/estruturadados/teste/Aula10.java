package com.linicker.estruturadados.teste;

import com.linicker.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		Contato c1 = new Contato("Contato1","1234-4597","contato1@email.com");
		Contato c2 = new Contato("Contato2","4434-4867","contato2@email.com");
		Contato c3 = new Contato("Contato3","1834-4566","contato3@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c2);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
		
		
	}

}
