import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int opcao;
		double real;
		double dolar = 5.23; // 20/07/2021
		double euro = 6.16; // 20/07/2021
		
		System.out.println("CONVERSOR DE MOEDAS");
		System.out.println("Selecione a moeda que deseja converter:\n1-D�lar\n2-Euro");
		opcao = leitor.nextInt();
		
		switch(opcao) {
		
		default:
			System.out.println("Op��o Inv�lida");
			break;
			
		case 1:
			System.out.println("Por favor, informe um valor em REAL para convrter para D�LAR");
			real = leitor.nextDouble();
			dolar = real / dolar;
			System.out.println("O valor em D�LAR �: $" + dolar);
			break;
			
		case 2:
			System.out.println("Por favor, informe um valor em REAL para converter para EURO");
			real = leitor.nextDouble();
			euro = real / euro;
			System.out.println("O valor em EURO �: �" + euro);
			break;		
		}

		leitor.close();
		
	}

}
