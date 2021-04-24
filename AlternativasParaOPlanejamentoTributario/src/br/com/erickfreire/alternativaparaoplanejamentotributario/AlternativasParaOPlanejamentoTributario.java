package br.com.erickfreire.alternativaparaoplanejamentotributario;

import java.util.Scanner;

/**
 * Programa em Java que informa o quanto de imposto você paga
 * @author Erick Freire
 * @version 1 - Criado em 24-04-2021 as 17:35
 */

public class AlternativasParaOPlanejamentoTributario {

	public static void main(String[] args) {
		
		double moradia;
		double alimentacao;
		double vestuario;
		double transporte;
		double educacao;
		double assistenciaMedica;
		double ferias;
		double taxa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculadora de impostos: ");
		
		System.out.print("Informe o valor gasto por mês de moradia: ");
		moradia = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por mês de alimentação: ");
		alimentacao = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por mês de vestuário: ");
		vestuario = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por mês de transporte: ");
		transporte = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por mês de educação: ");
		educacao = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por mês de assistencia médica: ");
		assistenciaMedica = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por mês para tirar férias: ");
		ferias = entrada.nextDouble();
		
		taxa = (moradia + alimentacao + vestuario + transporte + educacao + assistenciaMedica + ferias) * 0.3;
		
		System.out.printf("Taxa paga por mês:R$ %.2f de impostos", taxa);
		
	}

}
