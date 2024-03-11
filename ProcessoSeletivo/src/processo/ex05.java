package processo;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra;
		String palavrainvertida="";
		                           
		System.out.println("Digite uma palavra: ");
		palavra= scan.nextLine();
		
		  for (int i = palavra.length() - 1; i >= 0; i--) {
	            palavrainvertida += palavra.charAt(i);
		  }
		  System.out.println("Palavra invertida: " + palavrainvertida);
	}

}
