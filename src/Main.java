import java.util.Scanner;

import Calculo.Covercao;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("cotaçao do dolar: ");
		double dolar = sc.nextDouble();

		System.out.println("quantos dolar voce vai comprar: ");
		double quantidade = sc.nextDouble();
		
		double resultado = Covercao.coverterdolar(dolar, quantidade);
		System.out.println("valor em reis a pagar:" + resultado);

		sc.close();
	}

}
