package Calculo;

public class Covercao {
	
	public static final double IOF = 0.06;
	
	public static double coverterdolar(double dolar , double quantidade) {
		double imposto = dolar * quantidade * IOF;
		
		return dolar * quantidade + imposto;
		
	}

}
