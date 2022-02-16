package exercicio_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod;
		int alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.print("Digite um número: ");
		cod = sc.nextInt();
		
		while(cod != 4) {
			
			while (cod < 1 || cod > 4) {
				System.out.print("Numero invalido. Digite de novo: ");
				cod = sc.nextInt();
			}
			
			if (cod == 1) {
				alcool++;
			} else if (cod == 2) {
				gasolina++;
			} else if (cod == 3) {
				diesel++;
			}
			
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
