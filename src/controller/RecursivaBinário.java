package controller;

public class RecursivaBinário {
	public RecursivaBinário() {
		super();
	}
	/*Explicação: Recebe um valor n, o divide por 2 até chegar a 0, depois retorna o resto no formato de string para construir o número binário.
	  Quando chega a 0, retorna um valor String vazio.
	 */
public String recbin(int n, String res) {	
    if (n == 0) {
        return "";
    } else {
        res = recbin(n / 2, res) + (n % 2);
        return res;
    }
}
}
