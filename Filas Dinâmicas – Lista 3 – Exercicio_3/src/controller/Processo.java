package controller;

public class Processo {
	public String nome;
	public int QtdRetornos;
	
	public Processo(String _nome ,int _quantidadeDeRetornos) {
		this.nome = _nome;
		this.QtdRetornos = _quantidadeDeRetornos;
	}
	
	@Override
	public String toString() {
		return "Processo: " + nome +" Retornos: "+QtdRetornos+"\n";
	}
}
