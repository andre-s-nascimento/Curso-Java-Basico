package com.derrick.cursojava.aula19.labs;

public class exer01 {

	public static void main(String[] args) {
		int[] A = new int[5];
		int[] B = new int[5];
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
			B[i] = i;
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
		}
	}

}
