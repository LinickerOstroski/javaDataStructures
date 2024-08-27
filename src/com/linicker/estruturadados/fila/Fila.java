package com.linicker.estruturadados.fila;

import com.linicker.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		super.adiciona(elemento);
	}
	
	
	public T espiar() {
		if(super.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
	
	public T desenfileira() {
		
		final int POS = 0;
		
		if(super.estaVazia()) {
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		super.remove(POS);
		
		return elementoASerRemovido;
	}
	
	
}
