package controller;

public class Pessoa {

	public String nome;
	public int idade;
	public float altura;
	
	public Pessoa(String _nome, int _idade, float _altura) {
		this.nome = _nome;
		this.idade = _idade;
		this.altura = _altura;
	}

	@Override
	public String toString() {
		return "Nome: "+nome+" Idade: "+idade+"\nAltura: "+altura+"\n";
	}
}
