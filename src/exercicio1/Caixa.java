package exercicio1;

public class Caixa {
	Produto produto;
	int quantidade;


	public double calculaValorFinal(Produto produto, int quantidade) {
		double valorTotal = produto.getValor() * quantidade;
		
		if(produto.getTipo() == 1) {
		
		return valorTotal*0.90;
		} else if (produto.getTipo() == 2) {
			return valorTotal*0.80;
		} else {
			return valorTotal*0.90;
		}
		
	}

}
