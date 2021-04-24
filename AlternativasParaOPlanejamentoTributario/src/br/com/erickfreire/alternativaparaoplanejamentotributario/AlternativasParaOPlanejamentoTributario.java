package br.com.erickfreire.alternativaparaoplanejamentotributario;

import java.util.Scanner;

/**
 * Programa em Java que informa o quanto de imposto voc� paga
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
		
		System.out.print("Informe o valor gasto por m�s de moradia: ");
		moradia = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por m�s de alimenta��o: ");
		alimentacao = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por m�s de vestu�rio: ");
		vestuario = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por m�s de transporte: ");
		transporte = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por m�s de educa��o: ");
		educacao = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por m�s de assistencia m�dica: ");
		assistenciaMedica = entrada.nextDouble();
		
		System.out.print("Informe o valor gasto por m�s para tirar f�rias: ");
		ferias = entrada.nextDouble();
		
		taxa = (moradia + alimentacao + vestuario + transporte + educacao + assistenciaMedica + ferias) * 0.3;
		
		System.out.printf("Taxa paga por m�s:R$ %.2f de impostos", taxa);
		
	}

}
