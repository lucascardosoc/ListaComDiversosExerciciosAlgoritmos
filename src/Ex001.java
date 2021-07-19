import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor1, valor2;
		int soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("Digite um número");
		valor1 = leitor.nextInt();
		System.out.println("Digite outro número");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double) valor2;
		
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtração é: " + subtracao);
		System.out.println("O resultado da multiplicação é: " + multiplicacao);
		System.out.println("O resultado da divisão é: " + divisao);
		 
		leitor.close();
	}

}
