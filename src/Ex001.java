import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor1, valor2;
		int soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("Digite um n�mero");
		valor1 = leitor.nextInt();
		System.out.println("Digite outro n�mero");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double) valor2;
		
		System.out.println("O resultado da soma �: " + soma);
		System.out.println("O resultado da subtra��o �: " + subtracao);
		System.out.println("O resultado da multiplica��o �: " + multiplicacao);
		System.out.println("O resultado da divis�o �: " + divisao);
		 
		leitor.close();
	}

}
