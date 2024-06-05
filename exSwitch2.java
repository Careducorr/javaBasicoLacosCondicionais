package JavaBasico2;

import java.util.Scanner;

public class ExSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int cargo;
		float salario,novoSalario;
		
		System.out.println("\nDigite o nome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("\nDigite o número do cargo:\n1-Gerente\n2-Vendedor\n3-Supervisor\n4-Motorista\n5-Estoquista\n6-Técnico de TI");
		cargo = leia.nextInt();
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		
		switch(cargo) {
		case 1:
			novoSalario = (float) (salario+(0.1*salario));
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Gerente\nSalário: %.2f",novoSalario);
			break;
		case 2:
			novoSalario = (float) (salario+(0.07*salario));
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Vendedor\nSalário: %.2f",novoSalario);
			break;
		case 3:
			novoSalario = (float) (salario+(0.09*salario));
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Supervisor\nSalário: %.2f",novoSalario);
			break;
		case 4:
			novoSalario = (float) (salario+(0.06*salario));
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Motorista\nSalário: %.2f",novoSalario);
			break;
		case 5:
			novoSalario = (float) (salario+(0.05*salario));
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Estoquista\nSalário: %.2f",novoSalario);
			break;
		case 6:
			novoSalario = (float) (salario+(0.08*salario));
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Técnico de TI\nSalário: %.2f",novoSalario);
			break;
			default:
				System.out.println("\nOpção inválida!!!");
		}
	}

}
