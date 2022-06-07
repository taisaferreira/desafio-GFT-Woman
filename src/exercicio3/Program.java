package exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Icms icms = new Icms();
		Ipi ipi = new Ipi();
		Cofins cofins = new Cofins();
		
		System.out.println("Digite um valor: ");
		double valor = sc.nextDouble();
		double totalImpostos = icms.calculaImposto(valor) + ipi.calculaImposto(valor) + cofins.calculaImposto(valor) + valor;
		System.out.println("ICMS: " + icms.calculaImposto(valor));
		System.out.println("IPI: " + ipi.calculaImposto(valor));
		System.out.println("COFINS: " + cofins.calculaImposto(valor));
		System.out.println("Valor Final: " + totalImpostos);

	}

}
