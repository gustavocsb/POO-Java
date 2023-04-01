/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q03;

/**
 *
 * @author zxc
 */

/*
3. Uma pesquisa sobre algumas características físicas da população de uma determinada região coletou 
os seguintes dados, referentes a cada habitante:

a) sexo (m e f);

b) cor dos olhos (a (azuis), v (verdes), c (castanhos), p (pretos));

c) cor dos cabelos (l (loiros), c (castanhos), p (pretos), r (ruivos));

d) idade em anos.

e) valor do salário.

Para o cadastro, todos os campos deve ser validados, ou seja, para sexo, serão aceitos somente as 
opções ‘m’ e ‘f’; para cor de olhos, apenas as opções ‘a’, ‘v’, ‘c’ e ‘p’; para cor dos cabelos, 
apenas as opções ‘l’, ‘c’, ‘p’ e ‘r’; para idade, apenas valores entre 10 e 100 anos, inclusive 
estes e para o salário, não aceitar valores negativos.

Para indicar fim dos habitantes pesquisados, o usuário fornecerá um habitante fictício com idade igual a –1.

Ao final, o algoritmo deve determinar a porcentagem de indivíduos do sexo feminino, com idade entre 
18 e 35 anos e que tenham olhos castanhos e cabelos castanhos 
*/

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int populacao;
        
        System.out.print("Informe o tamanho da população: ");
        populacao = sc.nextInt(); sc.nextLine();
        
        //Array: String [] nomeString = new String[10];
        String [] sexo = new String[populacao];
        String [] olhos = new String[populacao];
        String [] cabelos = new String[populacao];
        int [] idade = new int[populacao];
        float [] salario = new float[populacao];
        int i;
        
        
        for(i = 0; i < populacao; i++){
               System.out.println("");
               System.out.println(i+1 + "º habitante");
               
            do{
               System.out.print("m - Masculino\nf - Feminino\nSexo: ");
               sexo[i] = sc.nextLine();
               if(!"m".equals(sexo[i])&&!"f".equals(sexo[i])){
                   System.out.println("Sexo inválido! Digite 'm' ou 'f'");
               }
            }while(!"m".equals(sexo[i])&&!"f".equals(sexo[i]));
            
            do{
                System.out.print("a - Azuis\nv - Verdes\nc - Castanhos\np - Pretos\nCor dos Olhos: ");
                olhos[i] = sc.nextLine();
                if(!"a".equals(olhos[i])&&!"v".equals(olhos[i])&&!"c".equals(olhos[i])&&!"p".equals(olhos[i])){
                    System.out.println("Cor dos olhos inválida! Digite 'a', 'v', 'c' ou 'p'");
                }
            }while(!"a".equals(olhos[i])&&!"v".equals(olhos[i])&&!"c".equals(olhos[i])&&!"p".equals(olhos[i]));
            
            do{
                System.out.print("l - Loiro\nc - Castanho\np - Preto\nr - Ruivo\nCor do cabelo: ");
                cabelos[i] = sc.nextLine();
                if(!"l".equals(cabelos[i])&&!"c".equals(cabelos[i])&&!"p".equals(cabelos[i])&&!"r".equals(cabelos[i])){
                    System.out.println("Cor do cabelo inválida! Digite 'l', 'c', 'p' ou 'r'");
                }
            }while(!"l".equals(cabelos[i])&&!"c".equals(cabelos[i])&&!"p".equals(cabelos[i])&&!"r".equals(cabelos[i]));
            
            do{
                System.out.print("Idade: ");
                idade[i] = sc.nextInt(); sc.nextLine();
                if(idade[i]<10||idade[i]>100){
                    System.out.println("Idade inválida! Digite uma idade entre 10 à 100");
                }
            }while(idade[i]<10||idade[i]>100);
            
            do{
                System.out.print("Salário: ");
                salario[i] = sc.nextFloat(); sc.nextLine();
                if(salario[i]<0){
                    System.out.println("Salário inválido! Digite um salário acima de 0");
                }
            }while(salario[i]<0);
        }
        
        /*
            Porcentagem de indivíduos do sexo feminino, com idade entre 
            18 e 35 anos e que tenham olhos castanhos e cabelos castanhos 
        */
        
        int totalFeminino=0, femininoX=0; 
        double porcentagemFF, porcentagemFT;
                
        for(i=0;i<populacao;i++){
            if("f".equals(sexo[i])){
                totalFeminino++;
            }
            if("f".equals(sexo[i])&&idade[i]<18||idade[i]>35){
            }else if("c".equals(olhos[i])){
            }else if("c".equals(cabelos[i])){
                femininoX++;
            }
        }
        
        porcentagemFF = (femininoX * 100) / totalFeminino;
        porcentagemFT = (femininoX * 100) / populacao;
        
        System.out.println("A porcentagem de mulheres, em relação ao total de mulheres, com idade entre 18 e 35 anos, com olhos castanhos e cabelos castanhos é: " + porcentagemFF + "%");
        System.out.println("A porcentagem de mulheres, em relação à população total, com idade entre 18 e 35 anos, com olhos castanhos e cabelos castanhos é: " + porcentagemFT + "%");
        
    }
}
