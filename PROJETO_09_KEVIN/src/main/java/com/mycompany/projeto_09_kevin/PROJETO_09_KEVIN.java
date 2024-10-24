/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_09_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_09_KEVIN {

    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String[] produtos = {"Coca-Cola", "Guarana Jesus", "Pizza 4 Queijos", "Pizza Portuguesa", 
                             "Pizza Margherita", "Macarrao com queijo", "Macarrao com carne moida", 
                             "Macarrao com frango frito", "Torta de Limao", "Torta de Maracuja"};
        float[] preco = {6.99f, 5.99f, 29.99f, 26.99f, 32.50f, 21.99f, 24.99f, 24.99f, 19.99f, 19.99f};
        String nome_cliente; 
        int qtd_itens;
        
        dado = new DataInputStream(System.in);
        
        System.out.print("Digite seu nome: ");
        nome_cliente = dado.readLine();
        
        qtd_itens = PegaNum("Digite a quantidade de itens a serem pedidos: ");
    }
    
    // Pega o número, filtrando os erros.
    public static int PegaNum(String texto) throws IOException {
        DataInputStream dado;
        String s;
        int num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            
            try {
                num = Integer.parseInt(s); // Converte para inteiro.
                if (num > 0) {
                    break; 
                }
                else {
                    System.out.println("Digite um valor positivo valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero inteiro valido.");
                Linha();
            }
        }
        
        return num;
    }
    
    // Escreve uma linha.
    public static void Linha() {
        System.out.println("------------------------------");
    }
}
