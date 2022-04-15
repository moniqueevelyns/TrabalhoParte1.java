package principal;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		GerenciaCliente gClientes = new GerenciaCliente();
		int resp = 1;
		while(resp != 0 ){
			System.out.println("Tabajara Comércio e Varejo (TCV)");
			System.out.println("1 - Cliente");
			System.out.println("2 - Produto");
			System.out.println("3 - Compra");
			System.out.println("0 - Sair");
			System.out.print("Digite uma opção: ");
			
			resp = sc.nextInt();
			
			switch(resp) {
			case 1: 
				gClientes.menu();
				break;
			}
		}
		
	}

}	
