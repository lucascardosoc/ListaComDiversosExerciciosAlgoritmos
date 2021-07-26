import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int i = 0;
		int numeros = 0;
		int soma = 0;
		
		while(i<100) {
			System.out.println("Digite o " + (i+1) + " º número");
			numeros = leitor.nextInt();
			i++;
			soma = numeros + soma;
		}
		
		System.out.println("A soma dos números é: " + soma);
		leitor.close();

	}

}
