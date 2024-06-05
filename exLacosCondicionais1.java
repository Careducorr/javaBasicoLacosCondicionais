package JavaBasico2;

import java.util.Scanner;

public class ExLacosCondicionais1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número para casa A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com um número para casa B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com um número para casa C: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		if(soma > c) {
			System.out.println("\nA soma ("+soma+") de "+a+" + "+b+", é maior que "+c);
		}else if(soma == c) {
			System.out.println("\nA soma ("+soma+") de "+a+" + "+b+", é igual a "+c);
		}else{
			System.out.println("\nA soma ("+soma+") de "+a+" + "+b+", é menor que "+c);
		}
	}
}
