import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int anoLucas, anoAndre, anoFlavio;
		int idadeLucas, idadeAndre, idadeFlavio;
		int anoAtual = 2021;
		
		System.out.println("Por favor, informe qual o ano de nascimento de Lucas");
		anoLucas = leitor.nextInt();
		idadeLucas = anoAtual - anoLucas;
		
		System.out.println("Por favor, informe qual o ano de nascimento de Andr�");
		anoAndre = leitor.nextInt();
		idadeAndre = anoAtual - anoAndre;
		
		System.out.println("Por favor, informe qual o ano de nascimento de Fl�vio");
		anoFlavio = leitor.nextInt();
		idadeFlavio = anoAtual - anoFlavio;
		
		if (idadeLucas > idadeAndre && idadeLucas > idadeFlavio) {
			System.out.println("Lucas nasceu em " + anoLucas + " ent�o possui " + idadeLucas + " anos, portanto � o mais velho entre os tr�s irm�os");
		}
		if (idadeAndre > idadeLucas && idadeAndre > idadeFlavio) {
			System.out.println("Andr� nasceu em " + anoAndre + " ent�o possui " + idadeAndre + " anos, portanto � o mais velho entre os tr�s irm�os");
		}
		if (idadeFlavio > idadeLucas && idadeFlavio > idadeAndre) {
			System.out.println("Fl�vio nasceu em " + anoFlavio + " ent�o possui " + idadeFlavio + " anos, portanto � o mais velho entre os tr�s irm�os");
		}
		leitor.close();

	}

}
