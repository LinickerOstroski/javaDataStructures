package com.linicker.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add(1,"B");
		
		System.out.println(arrayList);
		
		int pos = arrayList.indexOf("B");
		
		boolean existe = arrayList.contains("B");
		if(existe) {
			System.out.println("Existe no array");
		}else {
			System.out.println("Elemento não existe no array");
		}
		
		System.out.println("Index de B = " + pos);
		System.out.println(arrayList.get(2));
		
		arrayList.remove("C");
		
		System.out.println(arrayList);
		System.out.println("Tamanho do vetor: " + arrayList.size());
	}

}
