package exercicio2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set <Integer> numeros = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite 10 números");
		
		for(int i = 0; i < 10; i++) {
			numero = sc.nextInt();
			numeros.add(numero);
		}
		
		Iterator<Integer> iterator1 = numeros.iterator();
		double somaTotal = 0;
		double media = 0;
		
		while(iterator1.hasNext()) {
            int next = iterator1.next();  
            somaTotal += next;
            media = somaTotal / numeros.size(); 
        }
		
		Iterator<Integer> iterator2 = numeros.iterator();	
        int contador10 = 0;
        while(iterator2.hasNext()) {
            int next = iterator2.next();
            if(next > 10 ) contador10++;
        }
        
		Iterator<Integer> iterator3 = numeros.iterator();
        int contador50 = 0;	
        while(iterator3.hasNext()) {
            int next = iterator3.next();
            if(next > 50 ) contador50++;
        }
        
		
		System.out.println("Exibe o maior numero: " + Collections.max(numeros));

        System.out.println("Exibe o menor numero: " + Collections.min(numeros));
        
        System.out.println("Exibe a média: " + media);
          
        System.out.println("Quantos números são acima de 10: " + contador10);
        
        System.out.println("Quantos números são acima de 50: " + contador50);
        
        System.out.println(numeros);

	}

}
