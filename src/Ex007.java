import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int vetor[] = new int[100];
		int menor=0;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero");
			vetor[i] = leitor.nextInt();
			
			if(vetor[i]<=vetor[0]) {
				menor = vetor[i];
			}
			
		} 
			System.out.println("O menor n�mero digitado �: " + menor);

		leitor.close();
		
	}

}
