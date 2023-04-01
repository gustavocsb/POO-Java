/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q02;

/**
 *
 * @author zxc
 */

/*
2. Criar um algoritmo que informe a quantidade total de calorias de uma refeição a partir do usuário 
que deverá informar o prato, a sobremesa e a bebida (veja a tabela a seguir). 

    PRATO    | CALORIAS |    SOBREMESA    | CALORIAS |       BEBIDA      | CALORIAS 
-------------------------------------------------------------------------------------
Vegetariano  | 180 cal  | Abacaxi         | 75 cal   | Chá               | 20 cal
Peixe        | 230 cal  | Sorvete Diet    | 110 cal  | Suco Laranja      | 70 cal
Frango       | 250 cal  | Mouse Diet      | 170 cal  | Suco Melão        | 100 cal
Carne        | 350 cal  | Mouse Chocolate | 200 cal  | Refrigerante Diet | 65 cal

Enumere cada opção de prato, sobremesa e bebida.

Prato: 1 - vegetariano, 2 – Peixe, 3 – Frango, 4 – Carne;

Sobremesa: 1 – Abacaxi, 2 – Sorvete diet, 3 – Mouse diet, 4 – Mouse chocolate;

Bebida: 1 – Chá, 2 - Suco de laranja, 3 – Suco de melão, 4 – Refrigerante diet. 
*/

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int prato, pratoCal=0, sobremesa, sobremesaCal=0, bebida, bebidaCal=0, calTotal=0;
        
        do{
        System.out.print("--- PRATO PRINCIPAL ---\n1: Vegetariano\n2: Peixe\n3: Frango\n4: Carne\nInforme o prato desejado: ");
        prato = sc.nextInt();
        if(prato==1){
            pratoCal=180;
        }else if(prato==2){
                pratoCal=230;
            }else if(prato==3){
                    pratoCal=250;
                }else if(prato==4){
                        pratoCal=350;
                    }else System.out.println ("Prato indisponível!");
        }while (prato>4);
        
        do{
        System.out.print("--- SOBREMESA ---\n1: Abacaxi\n2: Sorvete diet\n3: Mouse diet\n4: Mouse chocolate\nInforme a sobremesa desejada: ");
        sobremesa = sc.nextInt();
        if(sobremesa==1){
            sobremesaCal=75;
        }else if(sobremesa==2){
                sobremesaCal=110;
            }else if(sobremesa==3){
                    sobremesaCal=170;
                }else if(sobremesa==4){
                        sobremesaCal=200;
                    }else System.out.println ("Sobremesa indisponível!");
        }while (sobremesa>4);
        
        do{
        System.out.print("--- BEBIDA ---\n1: Chá\n2: Suco de laranja\n3: Suco de melão\n4: Refrigerante diet\nInforme a bebida desejada: ");
        bebida = sc.nextInt();
        if(bebida==1){
            bebidaCal=20;
        }else if(bebida==2){
                bebidaCal=70;
            }else if(bebida==3){
                    bebidaCal=100;
                }else if(bebida==4){
                        bebidaCal=65;
                    }else System.out.println ("bebida indisponível!");
        }while (bebida>4);
        
        calTotal = pratoCal + sobremesaCal + bebidaCal;
        
        System.out.println("O total de calorias da sua refeição é: " + calTotal + " cal");
    }
}
