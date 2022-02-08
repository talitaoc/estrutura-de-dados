package com.loiane.cursojava.aula56;

public class Calculadora {

	enum Operacao{
		SOMA("+") {
			@Override
			public double operacao(double x, double y) {
				double num = x + y;
				return num;
			}
		}, SUBTRACAO("-") {
			@Override
			public double operacao(double x, double y) {
				double num = x - y;
				return num;
			}
		}, MULTIPLICACAO("*") {
			@Override
			public double operacao(double x, double y) {
				double num = x * y;
				return num;
			}
		}, DIVISAO("/") {
			@Override
			public double operacao(double x, double y) {
				double num = x / y;
				return num;
			}
		};

		String simbolo;

		Operacao(String simbolo){
			this.simbolo = simbolo;
		}

		public String toString() {
			return this.simbolo;
		}

		public abstract double operacao(double x, double y);
	}

	public static void main(String[] args) {

		double x = 2.0;
		double y = 3.0;
		
		for (Operacao operacao : Operacao.values()) {
			System.out.println(x + "  " + operacao.toString() + "  " + y + " = " + operacao.operacao(x, y));
		}
	}
}


