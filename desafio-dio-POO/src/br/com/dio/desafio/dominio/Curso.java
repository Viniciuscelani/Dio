package br.com.dio.desafio.dominio;

public class Curso {
	private String titulo;
	private String descricao;
	private int cargaH;
	
	public Curso() {
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaH() {
		return cargaH;
	}
	public void setCargaH(int cargaH) {
		this.cargaH = cargaH;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaH=" + cargaH + "]";
	}
	
}
