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
		
		System.out.println("Por favor, informe qual o ano de nascimento de André");
		anoAndre = leitor.nextInt();
		idadeAndre = anoAtual - anoAndre;
		
		System.out.println("Por favor, informe qual o ano de nascimento de Flávio");
		anoFlavio = leitor.nextInt();
		idadeFlavio = anoAtual - anoFlavio;
		
		if (idadeLucas > idadeAndre && idadeLucas > idadeFlavio) {
			System.out.println("Lucas nasceu em " + anoLucas + " então possui " + idadeLucas + " anos, portanto é o mais velho entre os três irmãos");
		}
		if (idadeAndre > idadeLucas && idadeAndre > idadeFlavio) {
			System.out.println("André nasceu em " + anoAndre + " então possui " + idadeAndre + " anos, portanto é o mais velho entre os três irmãos");
		}
		if (idadeFlavio > idadeLucas && idadeFlavio > idadeAndre) {
			System.out.println("Flávio nasceu em " + anoFlavio + " então possui " + idadeFlavio + " anos, portanto é o mais velho entre os três irmãos");
		}
		leitor.close();

	}

}
