package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[ ] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaH(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaH(5); 
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("mentoria js");
		mentoria2.setDescricao("descrição mentoria js");
		mentoria2.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println(mentoria2);

	}
}
