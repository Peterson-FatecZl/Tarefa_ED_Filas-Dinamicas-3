package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import model.filaGenerica;

public class Principal {

	public static void main(String[] args) throws Exception {
		filaGenerica<String> filaLigacoes = new filaGenerica<>();
		TelefoneController telefone = new TelefoneController();
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Inserir Números.\n2 - Consultar Chamadas Perdidas.\n9 - Sair\n ","Insira o Número da Opção Desejada",-1));

		while(opcao != 9) {
			switch(opcao) {
			case 1:
				String numeroDeTelefone =JOptionPane.showInputDialog(null, "Insira o Número de Telefone","");
				telefone.insereLigacao(filaLigacoes, numeroDeTelefone);
				break;
			case 2:
				telefone.consultaLigacoes(filaLigacoes);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor Inválido", "ERROR", 0);
				break;
			}
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Inserir Números.\n2 - Consultar Chamadas Perdidas.\n9 - Sair\n ","Insira o Número da Opção Desejada",-1));

		}
	}

}
