package exercicio_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		System.out.print("Senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha invalida");
			System.out.print("\nSenha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();

	}

}
