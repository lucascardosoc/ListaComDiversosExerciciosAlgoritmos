import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int i = 0;
		int numeros = 0;
		int maior = 0;

		while (i < 100) {
			System.out.println("Digite o " + (i + 1) + " � n�mero");
			i++;
			numeros = leitor.nextInt();
			
			if(numeros > maior) {
				maior = numeros;
			}
			
		}
		System.out.println("O maior n�mero digitado � " + maior);
		leitor.close();

	}

}
