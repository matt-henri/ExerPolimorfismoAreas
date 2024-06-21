package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Entre com a qualtidade de Formas: ");
		int n = sc.nextInt();
		
		for ( int i = 1 ; i <= n ; i++ ) {
			System.out.println("Forma número #" + i + ".");
			System.out.print("Se for Retangulo digite 'R' e se for Circulo 'C' !");
			char ch = sc.next().charAt(0);
			System.out.print("Qual a cor? (VERMELHO, AZUL, PRETO) ");
			Cor cor = Cor.valueOf(sc.next());
			if ( ch == 'R' ) {
				System.out.print("Qual a Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Qual a Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(cor, altura, largura));
				
			} else {
				System.out.println("Qual o raio:");
				double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			}
			

		}
		
		System.out.println();
		System.out.println("Areas das Formas: ");
		for ( Forma forma : list ) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		
		
		
		
		
		
		sc.close();
		
	}
}
