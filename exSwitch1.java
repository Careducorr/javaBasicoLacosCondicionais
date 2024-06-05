package JavaBasico2;

import java.util.Scanner;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valor1 = (float) 10.00,valor2 = (float) 15.00,valor3 = (float) 18.00,
				valor4 = (float) 12.00,valor5 = (float) 8.00,
				valor6 = (float) 13.00,valorT;
		int produto, quantidade;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nPara inicar seu pedido escolha uma das opções digitando o número:"
				+ "\n1--Cachorro quente"
				+ "\n2--X-Salada"
				+ "\n3--X-bacon"
				+ "\n4--Bauru"
				+ "\n5--Refrigerante"
				+ "\n6--Suco de laranja");
		produto = leia.nextInt();
		System.out.println("\nDigite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(produto) {
		case 1:
			valorT = valor1*quantidade;
			System.out.printf("\nProduto: Cachorro quente\nValor total: "+valorT);
			break;
		case 2:
			valorT = valor2*quantidade;
			System.out.printf("\nProduto: X-salada\nValor total: %.2f",valorT);
			break;
		case 3:
			valorT = valor3*quantidade;
			System.out.printf("\nProduto: X-bacon\nValor total: %.2f",valorT);
			break;
		case 4:
			valorT = valor4*quantidade;
			System.out.printf("\nProduto: Bauru\nValor total: %.2f",valorT);
			break;
		case 5:
			valorT = valor5*quantidade;
			System.out.printf("\nProduto: Refrigerante\nValor total: %.2f",valorT);
			break;
		case 6:
			valorT = valor6*quantidade;
			System.out.printf("\nProduto: Suco de Laranja\nValor total: %.2f",valorT);
			break;
			default:
				System.out.println("\nOpção inválida!!!");
		}
	}

}
