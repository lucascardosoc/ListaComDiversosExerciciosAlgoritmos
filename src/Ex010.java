import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		int opcao = 0, numeroAulas;
		double horaAula1 = 12, horaAula2 = 17, horaAula3 = 25, salario, salarioBase, horaAtividade, descansoSemanalRemunerado;
		
		while(opcao!=4) {
			System.out.println("Escola APRENDER - Ferramenta de aux�lio ao professor");
			System.out.println("Por favor, escolha o n�vel do professor no qual deseja calcular o sal�rio");
			System.out.println("1 - Professor N�vel 1");
			System.out.println("2 - Professor N�vel 2");
			System.out.println("3 - Professor N�vel 3");
			System.out.println("4 - Sair");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			default:
				System.out.println("Opc�o incorreta, Encerrando programa");
				break;
				
			case 1: 
				System.out.println("Para que seja poss�vel calcular o sal�rio base, informe o n�mero de aulas que o professor tem na instituic�o");
				numeroAulas = leitor.nextInt();
				salarioBase = numeroAulas * 4 * horaAula1;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O sal�rio do professor est� composto da seguinte forma:");
				System.out.println("Sal�rio Base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Sal�rio total: R$" + salario);
				break;
				
			case 2: 
				System.out.println("Para que seja poss�vel calcular o sal�rio base, informe o n�mero de aulas que o professor tem na instituic�o");
				numeroAulas = leitor.nextInt();
				salarioBase = numeroAulas * 4 * horaAula2;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O sal�rio do professor est� composto da seguinte forma:");
				System.out.println("Sal�rio Base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Sal�rio total: R$" + salario);
				break;
				
			case 3:
				System.out.println("Para que seja poss�vel calcular o sal�rio base, informe o n�mero de aulas que o professor tem na instituic�o");
				numeroAulas = leitor.nextInt();
				salarioBase = numeroAulas * 4 * horaAula3;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O sal�rio do professor est� composto da seguinte forma:");
				System.out.println("Sal�rio Base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Sal�rio total: R$" + salario);
				break;
				
			case 4:
				System.out.println("Encerrando sistema...");
			}
		}
		leitor.close();
	}

}

/*O sal�rio dos professores de escolas particulares em
 * S�o Paulo � composto da seguinte forma 
 * http://www1.sinprosp.org.br/guia_consultas.asp?mat=8*/
