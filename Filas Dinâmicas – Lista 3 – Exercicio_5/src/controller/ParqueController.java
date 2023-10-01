package controller;

import model.filaGenerica;

public class ParqueController {

	public ParqueController() {
		super();
	}
	
	public void brinquedo(filaGenerica<Pessoa> fila) throws Exception{
		while(!fila.isEmpty()) {
			Pessoa cliente = fila.remove();
			if(cliente.idade < 17) {
				System.out.println(cliente.nome +" Não passou por causa de sua idade que é "+cliente.idade);
			}else if(cliente.altura <= 1.60) {
				System.out.printf("%s Não passou por causa de sua altura que é %.2f \n",cliente.nome, cliente.altura);
			}else {
				System.out.println(cliente.nome+" Passou para Dentro do Brinquedo!");
			}
		}
			
	}

}
