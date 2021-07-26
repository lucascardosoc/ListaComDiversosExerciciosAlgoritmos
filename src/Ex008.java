import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int resposta=0;
		String sim;
		int questao1 = 1;
		
		
		while(resposta!=1) {
			System.out.println("1 - Velozes e furiosos foi lancado em 2001? Digite 1 para sim e 2 para não.");
			resposta = leitor.nextInt();
		}
		
		while(resposta!=2) {
			System.out.println("2 - Tim Cook foi o criador da Apple? Digite 1 para sim e 2 para não.");
			resposta = leitor.nextInt();
		}
		
		
		leitor.close();
	}

}
