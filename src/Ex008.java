import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		String resposta;
		
		System.out.println("QUIZ FILME - Saga: Velozes e Furiosos");
		System.out.println("1- O primeiro filme da saga Velozes e Furiosos foi lancado em 2001?");
		resposta = leitor.next();
		
		if(resposta.equalsIgnoreCase("SIM")) {
		System.out.println("2- O nome do personagem Paul Walker � Dominic Toretto?");
		resposta = leitor.next();
		
		if(resposta.equalsIgnoreCase("N�O")) {
		System.out.println("3- O autor Paul Walker faleceu em 2013 em um acidente de carro?");
		resposta = leitor.next();
		
		if(resposta.equalsIgnoreCase("SIM")) {
		System.out.println("4- Velozes e furiosos 5 se passa no Rio de Janeiro?");
		resposta = leitor.next();
		
		if(resposta.equalsIgnoreCase("SIM")) {
		System.out.println("5- O nome do personagem Dominic Toretto � Vin Diesel?");
		resposta = leitor.next();
		
		if(resposta.equalsIgnoreCase("SIM")) {
		System.out.println("6- A saga Velozes e Furiosos tem 10 filmes?");
		resposta = leitor.next();
		
		if(resposta.equalsIgnoreCase("N�O")) {
		System.out.println("7- A personagem Mia � casada com o personagem Brian?");
		resposta = leitor.next();
		
		if(resposta.equalsIgnoreCase("SIM")) {
		System.out.println("8- Velozes e Furiosos 3 se passa nos Estados Unidos?");
		resposta = leitor.next();
		
		if(resposta.equalsIgnoreCase("N�O")) {
			System.out.println("9- O n�mero da casa de Dominic Toreto � 1327?");
			resposta = leitor.next();
			
			if(resposta.equalsIgnoreCase("SIM")) {
			System.out.println("10- Quando o autor Paul Walker morreu estavam gravando o filme de n�mero 7?");	
			resposta = leitor.next();
			
			if(resposta.equalsIgnoreCase("SIM")) {
			System.out.println("PARAB�NS! VOC� ACERTOU TODAS AS PERGUNTAS!");	
			}
			}
		}
		}
		}
		}
		}
			
		}
		}
		}
		
		leitor.close();
	}

}
