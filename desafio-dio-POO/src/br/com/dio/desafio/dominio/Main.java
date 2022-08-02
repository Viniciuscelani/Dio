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
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devVini = new Dev();
		devVini.setNome("Vinicius");
		devVini.inscreverBootcamp(bootcamp);
		devVini.progredir();
		System.out.println("Conteudos Inscritos Vinicius:" + devVini.getConteudoInscritos() );
		System.out.println("Conteudos concluidos Vinicius:" + devVini.getConteudosConcluidos() );
		System.out.println("XP:" + devVini.calcularTotalXp());
		
		System.out.println("-----------------------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		devJoao.progredir();
		System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudoInscritos() );
		System.out.println("Conteudos concluidos João:" + devJoao.getConteudosConcluidos() );
		System.out.println("XP:" + devJoao.calcularTotalXp());
	}
}
