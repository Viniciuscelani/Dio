package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaH;
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaH;
	}
	
	public Curso() {
		
	}
	
	public int getCargaH() {
		return cargaH;
	}
	public void setCargaH(int cargaH) {
		this.cargaH = cargaH;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaH=" + cargaH + "]";
	}

	
	
}
