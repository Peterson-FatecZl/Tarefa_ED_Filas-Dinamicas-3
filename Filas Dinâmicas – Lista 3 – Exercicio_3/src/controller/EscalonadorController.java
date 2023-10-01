package controller;

import model.filaGenerica;

public class EscalonadorController {

	public EscalonadorController() {
		super();
	}
	
	public void Escalonador(filaGenerica<Processo> filaDeProcessos) throws Exception {
		while(!filaDeProcessos.isEmpty()) {
			Processo auxiliar = filaDeProcessos.remove();
			if(auxiliar.QtdRetornos > 1) {
				auxiliar.QtdRetornos--;
				System.out.println(auxiliar);
				filaDeProcessos.insert(auxiliar);//volta pra fila
			}
		}
	}

}
