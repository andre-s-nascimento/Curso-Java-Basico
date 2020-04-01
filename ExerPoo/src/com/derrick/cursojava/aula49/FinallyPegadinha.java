package com.derrick.cursojava.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};

		for (int i=0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			} 
			catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posi��o do array inv�lida");
				System.exit(0);
			} 
			//O finally n�o ser� executado neste caso por conta do "System.exit(0)"
			//System.exit(0); For�a a sa�da do programa.
			finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou catch");
				System.out.println();
			}
		}
	}

}
