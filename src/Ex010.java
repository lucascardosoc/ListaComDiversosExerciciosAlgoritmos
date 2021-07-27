import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		int opcao = 0, numeroAulas;
		double horaAula1 = 12, horaAula2 = 17, horaAula3 = 25, salario, salarioBase, horaAtividade, descansoSemanalRemunerado;
		
		while(opcao!=4) {
			System.out.println("Escola APRENDER - Ferramenta de auxílio ao professor");
			System.out.println("Por favor, escolha o nível do professor no qual deseja calcular o salário");
			System.out.println("1 - Professor Nível 1");
			System.out.println("2 - Professor Nível 2");
			System.out.println("3 - Professor Nível 3");
			System.out.println("4 - Sair");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			default:
				System.out.println("Opcão incorreta, Encerrando programa");
				break;
				
			case 1: 
				System.out.println("Para que seja possível calcular o salário base, informe o número de aulas que o professor tem na instituicão");
				numeroAulas = leitor.nextInt();
				salarioBase = numeroAulas * 4 * horaAula1;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O salário do professor está composto da seguinte forma:");
				System.out.println("Salário Base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Salário total: R$" + salario);
				break;
				
			case 2: 
				System.out.println("Para que seja possível calcular o salário base, informe o número de aulas que o professor tem na instituicão");
				numeroAulas = leitor.nextInt();
				salarioBase = numeroAulas * 4 * horaAula2;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O salário do professor está composto da seguinte forma:");
				System.out.println("Salário Base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Salário total: R$" + salario);
				break;
				
			case 3:
				System.out.println("Para que seja possível calcular o salário base, informe o número de aulas que o professor tem na instituicão");
				numeroAulas = leitor.nextInt();
				salarioBase = numeroAulas * 4 * horaAula3;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O salário do professor está composto da seguinte forma:");
				System.out.println("Salário Base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Salário total: R$" + salario);
				break;
				
			case 4:
				System.out.println("Encerrando sistema...");
			}
		}
		leitor.close();
	}

}

/*O salário dos professores de escolas particulares em
 * São Paulo é composto da seguinte forma 
 * http://www1.sinprosp.org.br/guia_consultas.asp?mat=8*/
