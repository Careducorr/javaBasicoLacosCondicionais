package JavaBasico2;

import java.util.Scanner;

public class ExLacosCondicionais3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade, aux;
		boolean primeiraDoacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do doador: ");
		nome = leia.nextLine();
		System.out.println("\nDigite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("\nPrimeira doacão? Digite 1 para Sim ou 2 para Não: ");
		aux = leia.nextInt();
		
		if(aux == 1) {
			primeiraDoacao = true;
		}else {
			primeiraDoacao=false;
		}
		
		
		if(idade>=18 && idade<60) {
			System.out.println(nome+" está apto para doar sangue!");
		}else if(idade>=60 && idade<70 && primeiraDoacao) {
			System.out.println(nome+" está apto para doar sangue!");
		}else if(idade>=60 && idade<70 && (primeiraDoacao=false)) {
			System.out.println(nome+" não está apto para doar sangue!!!");
		}else if(idade>=70 || idade<18) {
			System.out.println(nome+" não está apto para doar sangue!!!");
		}

	}

}
