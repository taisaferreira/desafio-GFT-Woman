package exercicio3;

public class Cofins implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		double valorFinal;
		
		if(valor >= 17000) {
			valorFinal = valor * 0.08;
		} else {
			valorFinal = 0;
		}
		
		return valorFinal;
		
	}

}
