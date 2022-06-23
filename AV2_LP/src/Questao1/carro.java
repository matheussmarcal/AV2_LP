package Questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class carro {

	public static void main(String[] args) {

		ArrayList<String> fipe = new ArrayList();

		Scanner ler = new Scanner(System.in);
		int menu;
		do {
			System.out.println("---MENU---");
			System.out.println("<1> Cadastrar carro");
			System.out.println("<2> Listagem geral");
			System.out.println("<3> Mostrar resultados");
			System.out.println("<4> Sair");

			menu = ler.nextInt();
			String valor;
			
			String marca,modelo;
			int somaValor;
			int media;
			int ano;
			int contador=0;
			
			switch (menu) {

			case 1:
				System.out.println("Digite a marca do seu carro");
				fipe.add(ler.next());
				System.out.println("Digite o modelo do seu carro");
				fipe.add(ler.next());
				System.out.println("Digite o ano do seu carro");
				fipe.add(ler.next());
				System.out.println("Digite o valor do seu carro");
				valor=ler.next();
				double valorDouble;
				valorDouble = Double.parseDouble(valor);
				fipe.add(valor);
				System.out.println("Carro cadastrado com sucesso!");
				break;

			case 2:
				for (int i = 0; i < fipe.size(); i++)
					System.out.println(fipe.get(i));
				break;

			case 3:
				media = ((somaValor=0))/(contador=0));
				System.out.println("A média de anos dos veículos cadastrados é: " + media);
				break;

			}
		} while (menu != 4);

	}
}
