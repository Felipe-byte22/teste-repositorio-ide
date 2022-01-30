package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	private static int multiplicacao;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		float divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A subtração dos valores é: " + subtracao);
		System.out.println("A divisão dos valores é: " + divisao);
		System.out.println("A multiplicação dos valores é: " + multiplicacao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static float divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
