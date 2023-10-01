package view;

import controller.ParqueController;
import controller.Pessoa;
import model.filaGenerica;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		filaGenerica<Pessoa> filaBrinquedo = new filaGenerica<>();
		ParqueController parqueController = new ParqueController();
		
		for(int i = 0;i < 30; i++) {
			String nome = "Pessoa"+String.valueOf(i+1);
			int idade = (int)(Math.random()*31)+10;
			float altura = (float)((Math.random()*0.66)+1.35);
			Pessoa pessoa = new Pessoa(nome, idade, altura);
			filaBrinquedo.insert(pessoa);
		}
		parqueController.brinquedo(filaBrinquedo);
		
	}

}
