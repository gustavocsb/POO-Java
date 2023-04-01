/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro.user;

/**
 *
 * @author zxc
 */

import java.util.Scanner;

public class CadastroUser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----- CADASTRO DE USER -----\n");
        System.out.print("Digite o nome do user: ");
        String user_nome = sc.nextLine();
        
        System.out.print("Digite a idade do user: ");
        int user_age = sc.nextInt(); sc.nextLine(); 
            //como não tem o fflush em java fiz assim para nao quebrar a leitura da string abaixo
        
        System.out.print("Digite o email do user: ");
        String user_email = sc.nextLine();
        
        System.out.print("Digite o telefone do user: ");
        String user_phone = sc.nextLine();
        
        System.out.println("\nCadastro efetuado com sucesso!\n");
        System.out.println("Nome: " + user_nome);
        System.out.println("Idade: " + user_age);
        System.out.println("Email: " + user_email);
        System.out.println("Telefone: " + user_phone);
    }
}
