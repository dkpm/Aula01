import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		
		String nome;

		//Ler o que o usu�rio digitar
		Scanner leitor = new Scanner(System.in);
		System.out.print("Pfvr, escreva seu nome:");
		//Recebe o texto que o usu�rio escrever
		nome = leitor.next();
		System.out.print("Obrigado(a) " + nome);
		
		leitor.close();
	}

}
