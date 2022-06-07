package exercicio1;

public class Program {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Banana",0.99,2);
		Produto produto2 = new Produto("Energético",5.49,3);
		Produto produto3 = new Produto("Arroz",20.0,1);
		Produto produto4 = new Produto("Chocolate",4.50,1);
		Produto produto5 = new Produto("Leite",3.73,3);
		Produto produto6 = new Produto("Abacaxi",2.40,2);
		
		Caixa caixa = new Caixa();
		
		System.out.println("Produto: " + produto1.getNome() + "\nValor Total: R$ " + caixa.calculaValorFinal(produto1, 3));
		System.out.println();
		System.out.println("Produto: " + produto2.getNome() + "\nValor Total: R$ " + caixa.calculaValorFinal(produto2, 7));
		System.out.println();
		System.out.println("Produto: " + produto3.getNome() + "\nValor Total: R$ " + caixa.calculaValorFinal(produto3, 1));
		System.out.println();
		System.out.println("Produto: " + produto4.getNome() + "\nValor Total: R$ " + caixa.calculaValorFinal(produto4, 12));
		System.out.println();
		System.out.println("Produto: " + produto5.getNome() + "\nValor Total: R$ " + caixa.calculaValorFinal(produto5, 5));
		System.out.println();
		System.out.println("Produto: " + produto6.getNome() + "\nValor Total: R$ " + caixa.calculaValorFinal(produto6, 1));


	
	}

}
