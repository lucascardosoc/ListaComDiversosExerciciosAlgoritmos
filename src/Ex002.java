import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double pisoCm2, pisoM, salaM2, total;
		
		System.out.println("Por favor, informe a �rea do piso em cm�");
		pisoCm2 = leitor.nextDouble();
		System.out.println("Por favor, informe a �rea da sala em m�");
		salaM2 = leitor.nextDouble();
		
		pisoM = pisoCm2 / (double) 10000;
		total = salaM2 / pisoM;
		
		System.out.println("Para cobrir toda a sala s�o necess�rios: " + total + " pisos ");
		
		leitor.close();

	}

}
