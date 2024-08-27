package com.linicker.estruturadados.pilha.teste;

import java.util.Stack;

import com.linicker.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		
	}

}
