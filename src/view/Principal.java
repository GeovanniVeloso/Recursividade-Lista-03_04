package view;

import javax.swing.JOptionPane;

import controller.RecursivaBinário;

public class Principal {

	public static void main(String[] args) {
		RecursivaBinário rb = new RecursivaBinário();
		int n = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("insira o valor a ser convertido"));
			if(n>2000 || n<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
		}while(n>2000 || n<0);
		
		
		String result = "";
		String res = rb.recbin(n, result);
		
		System.out.println(res);

	}
}
