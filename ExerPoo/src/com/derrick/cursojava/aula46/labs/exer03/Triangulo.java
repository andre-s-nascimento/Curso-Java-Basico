package com.derrick.cursojava.aula46.labs.exer03;

public class Triangulo extends Figura2D{
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double area = (getBase() * getAltura())/2;
		
		return area;
	}

}
