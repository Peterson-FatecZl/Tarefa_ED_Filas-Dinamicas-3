package controller;

import javax.swing.JOptionPane;

import model.filaGenerica;

public class TelefoneController {

	public TelefoneController() {
		super();
	}

	public void insereLigacao(filaGenerica<String> filaLigacoes, String numeroDeTelefone) {
		filaLigacoes.insert(numeroDeTelefone);		
	}

	public void consultaLigacoes(filaGenerica<String> filaLigacoes) throws Exception {
		if(!filaLigacoes.isEmpty()) {
			System.out.println(filaLigacoes.remove());
		}else {
			JOptionPane.showMessageDialog(null, "Fila Vazia", "ATENÇÃO",2);
		}
		
	}

}
