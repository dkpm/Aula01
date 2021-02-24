import java.util.Scanner;

public class Calculadora {

	static Scanner leitor = new Scanner(System.in);
	static double numero1;
	static double numero2;
	static double resultadoSoma, resultadoMultiplicao, resultadoDivisao, resultadoSubtracao;
	

	public static void main(String[] args) {
	
		Calculadora.Somar(args);
		Calculadora.Multiplicar(args);
		Calculadora.Dividir(args);
		Calculadora.Subtrair(args);

	}
	


	public static void Somar(String[] args) {

		System.out.print("Vamos Somar \n");
		System.out.print("Digite o primeiro valor:");
		numero1 = leitor.nextDouble();

		System.out.print("Digite o segundo valor:");
		numero2 = leitor.nextDouble();

		resultadoSoma = numero1 + numero2;

		System.out.print("Seu resultado:" + resultadoSoma + "\n");
	}

	public static void Multiplicar(String[] args) {

		System.out.print("Vamos Multiplicar \n");
		System.out.print("Digite o primeiro valor:");
		numero1 = leitor.nextDouble();

		System.out.print("Digite o segundo valor:");
		numero2 = leitor.nextDouble();

		resultadoMultiplicao = numero1 * numero2;

		System.out.print("Seu resultado:" + resultadoMultiplicao + "\n");

	}

	public static void Dividir(String[] args) {

		System.out.print("Vamos Dividir \n");
		System.out.print("Digite o primeiro valor:");
		numero1 = leitor.nextDouble();

		System.out.print("Digite o segundo valor:");
		numero2 = leitor.nextDouble();

		resultadoDivisao = numero1 / numero2;

		System.out.print("Seu resultado:" + resultadoDivisao + "\n");

	}

	public static void Subtrair(String[] args) {
		System.out.print("Vamos Subtrair \n");
		System.out.print("Digite o primeiro valor:");
		numero1 = leitor.nextDouble();

		System.out.print("Digite o segundo valor:");
		numero2 = leitor.nextDouble();

		resultadoSubtracao = numero1 - numero2;

		System.out.print("Seu resultado:" + resultadoSubtracao + "\n");

		leitor.close();

	}
}


