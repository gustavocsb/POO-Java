/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.q01;

/**
 *
 * @author zxc
 */

/*
1. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, 
o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
*/

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float salarioFinal, salarioFixo, comissao, valorTotal;
        int numVendas;
        
        System.out.print("Digite quantos carros foram vendidos: ");
        numVendas = sc.nextInt();
        
        System.out.print("Digite o valor total das vendas: ");
        valorTotal = sc.nextFloat();
        
        System.out.print("Digite o salário fixo: ");
        salarioFixo = sc.nextFloat();
        
        System.out.print("Digite o valor da comissão: ");
        comissao = sc.nextFloat();
        
        // y = (5x)/100
        salarioFinal = salarioFixo + (comissao*numVendas) + ((valorTotal*5)/100); 
        System.out.println("O salário final do vendedor é: " + salarioFinal);    
    }
}
