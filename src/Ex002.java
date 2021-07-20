import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double pisoCm2, pisoM, salaM2, total;
		
		System.out.println("Por favor, informe a área do piso em cm²");
		pisoCm2 = leitor.nextDouble();
		System.out.println("Por favor, informe a área da sala em m²");
		salaM2 = leitor.nextDouble();
		
		pisoM = pisoCm2 / (double) 10000;
		total = salaM2 / pisoM;
		
		System.out.println("Para cobrir toda a sala são necessários: " + total + " pisos ");
		
		leitor.close();

	}

}
