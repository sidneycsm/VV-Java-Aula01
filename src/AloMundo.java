import java.math.BigDecimal;

import java.util.Scanner;

public class AloMundo {
	public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);
		// int valorDigitado = Integer.valueOf(scanner.next());

		// int codigoPedido = 10;
		// int valorA = 10;
		// int valorMod = 2;
		// int resultado = valorDigitado % valorMod;
		// BigDecimal valor = BigDecimal.TEN;
		// System.out.println("Ola Mundo");
		// System.out.println(codigoPedido);
		// System.out.println(valor);

		// if (resultado == 0) {
		// System.out.println("Este numero é par");
		// }
		// else {
		// System.out.println("Este número é impar");
		// }

		// int soma=0;
		// while(soma<10) {
		// soma++;
		// if(soma == 5) {
		// continue;
		// }
		// else {
		// System.out.println("Valor de soma = "+soma);
		// }
		// }
		// System.out.println("Terminei");
/*
 * comentando bloco
 */
		// int valorSoma = 0;
		// for (int i = 0; i < 05; i++) {
		// valorSoma = valorSoma + 5;
		// System.out.println("Somando Valores: "+valorSoma);
		// }
		// System.out.println("Valor da soma é: "+valorSoma);

		//int opcao = 0;
		//switch (opcao) {

		//case 1: {
		//	System.out.println("Opcao 01");
		//	break;
		//}
		//case 2: {
		//	System.out.println("Opcao 02");
		//	break;
		//}
		//case 3: {
		//	System.out.println("Opcao 03");
		//	break;
		//}
		//case 4: {
		//	System.out.println("Opcao 04");
		//	break;
		//}
		//case 5: {
		//	System.out.println("Opcao 05");
		//	break;
		//}
		//default: {
		//	System.out.println("Opcao nao programada");
		//	break;
		//}
		//}
		System.out.println("Informe o número do pedido: ");
		Scanner scanner = new Scanner(System.in);
		int codigoDifitado = Integer.valueOf(scanner.next());
		
		Pedido pedido = new Pedido();
		pedido.setCodigo(codigoDifitado);
		
		System.out.println("Pedido informado é: "+pedido.getCodigo());
	}
}
