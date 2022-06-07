package exercicio3;

public class Ipi implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		double valorFinal;
		
		if(valor < 25000) {
			valorFinal = valor * 0.5;
		} else {
			valorFinal = valor * 0.10;
		}
		
		return valorFinal;
		
	}

}
