package view;

import javax.swing.JOptionPane;

import controller.ImpressoraController;
import model.filaGenerica;

public class Principal {

	public static void main(String[] args) throws Exception {
		ImpressoraController impressora = new ImpressoraController();
		filaGenerica<String> filaDeDocumentos = new filaGenerica<>();
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Inserir Documento.\n2 - Imprimir.\n9 - Sair\n ","Insira o Número da Opção Desejada",-1));

		while(opcao != 9) {
			switch(opcao) {
			case 1:
				String Documento =JOptionPane.showInputDialog(null, "Insira o nome e formato do Documento",".ID_PC");
				impressora.insereDocumento(filaDeDocumentos, Documento);
				break;
			case 2:
				impressora.imprime(filaDeDocumentos);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor Inválido", "ERROR", 0);
				break;
			}
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Inserir Documento.\n2 - Imprimir.\n9 - Sair\n ","Insira o Número da Opção Desejada",-1));

		}

	}

}
