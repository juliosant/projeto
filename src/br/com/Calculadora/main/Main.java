package br.com.Calculadora.main;

import java.util.Scanner;

public class Main {

	private static Scanner resp;

	public static void main(String[] args) {
		int x;
		int y;
		resp = new Scanner(System.in);
		int resposta;
		
		System.out.println("Olá criança, eu quero jogar:");
		System.out.println("Escolha um numero de 1 à 3:");
		resposta = resp.nextInt();
		
		if(resposta == 1){
			y = 50;
			System.out.println("Penso em um valor de 1 à 100. Advinhe!!");
			resp = new Scanner(System.in);
			x = resp.nextInt();
			
			if(x == y)
				System.out.println("Você se livrou da morte");
			else
				System.out.println("ERRRROU!!!");
		}
		
//------------------------------//------------------------------//------------------------------//		
		else if(resposta == 2){
			System.out.println("Escreva um valor grande:");
			resp = new Scanner(System.in);
			x = resp.nextInt();
			System.out.println("Digite outro: ");
			resp = new Scanner(System.in);
			y = resp.nextInt();
			
			System.out.print("Ótimo, ótimo! Pense em um número de 1 à 4:");
			resp = new Scanner(System.in);
			int z = resp.nextInt();
			
			if(z == 1)
				System.out.printf("Quanto é "+x, " + "+y,"?");
		}
//------------------------------//------------------------------//------------------------------//
	
	
	}

}
