package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	LocalDate data;
	
	
	public Mentoria() {
		
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	
	
}