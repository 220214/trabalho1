package View;

import javax.swing.JOptionPane;

import Controller.RedesController;

public class Main {

	public static void main(String[]args) {
		RedesController redesController = new RedesController();
		int opc = 0;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n 1- Chamada do método ip\n 2 - chamadas do método ping\n 9 - fim"));
		switch(opc) {

		case 1: 
			redesController.readProcess();
			break;
		case 2:
			redesController.readping();
			break;
		case 9: 
			JOptionPane.showInputDialog(null, "FIM");
			break;
			default:
				JOptionPane.showInputDialog(null, "Opção Invalida!, digite 1,2 ou 9");		
		}
		}
		while(opc!= 9);
	}
	}


