package controller;

import model.filaGenerica;

public class ImpressoraController {

	public ImpressoraController() {
		super();
	}

	public void insereDocumento(filaGenerica<String> fila, String documento) {
		if (documento.endsWith(".ID_PC")) {// validação
			fila.insert(documento);
		} else {
			System.err.println("Formato de Documento Inválido");
		}
	}

	public void imprime(filaGenerica<String> fila) throws Exception {
		if (!fila.isEmpty()) {
			// remove o arquivo e ja exibe seu nome
			int milisegundos = (int) (Math.random() * 1001) + 1000;
			Thread.sleep(milisegundos);//tempo de impressão
			System.out.println("[#PC: ID_PC – Arquivo: " + fila.remove());
		} else {
			System.err.println("A Fila Está Vazia");
		}
	}
}
