package JavaBasico2;

import java.util.Scanner;

public class ExlacosCondicionais2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		a = leia.nextInt();
		
		if(a>0 && a%2==0) {
			System.out.println("\nO número "+a+" é um número par e positivo!");
		}else if(a>0 && a%2!=0) {
			System.out.println("\nO número "+a+" é um número ímpar e positivo!");
		}else if(a<0 && a%2==0) {
			System.out.println("\nO número "+a+" é um número par e negativo!");
		}else if(a<0 && a%2!=0) {
			System.out.println("\nO número "+a+" é um número ímpar e negativo!");
		}else {
			System.out.println("\nO número "+a+" é um número neutro!");
		}
		
		System.out.println(a);
	}

}
