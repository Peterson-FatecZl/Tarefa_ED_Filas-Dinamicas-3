package view;

import controller.EscalonadorController;
import controller.Processo;
import model.filaGenerica;

public class Principal {

	public static void main(String[] args) throws Exception {
		filaGenerica<Processo> processosEnfileirados = new filaGenerica<>();
		
		Processo p1 = new Processo("notepad.exe", 14);
		Processo p2 = new Processo("write.exe", 35);
		Processo p3 = new Processo("chrome.exe", 27);
		Processo p4 = new Processo("acrobat.exe", 52);
		Processo p5 = new Processo("firefox.exe", 18);
		Processo p6 = new Processo("word.exe", 25);
		
		processosEnfileirados.insert(p1);
		processosEnfileirados.insert(p2);
		processosEnfileirados.insert(p3);
		processosEnfileirados.insert(p4);
		processosEnfileirados.insert(p5);
		processosEnfileirados.insert(p6);
		
		EscalonadorController controller = new EscalonadorController();
		controller.Escalonador(processosEnfileirados);
		
	}

}
