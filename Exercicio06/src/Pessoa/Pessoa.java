package Pessoa;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private float altura;
	
	
	public int idade() {
		LocalDate hoje = LocalDate.now();
		int idade = hoje.getYear() - dataNascimento.getYear();
		if(dataNascimento.getMonthValue() < hoje.getMonthValue()) {
			 idade--;
			
		}
			
		return idade;
	}
	
	public String dados() {
		return "Nome: "+nome+ "\nData Nascimento: "+dataNascimento+ "\naltura: " + altura+ "\nIdade: "+ idade();
		
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
