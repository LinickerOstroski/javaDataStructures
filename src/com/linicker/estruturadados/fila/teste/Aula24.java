package com.linicker.estruturadados.fila.teste;

import com.linicker.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		
		fila.enfileiraComPrioridade(1);
		fila.enfileiraComPrioridade(3);
		fila.enfileiraComPrioridade(2);
		
		System.out.println(fila);
	}

}
