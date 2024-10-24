/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_09_kevin;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
        
        int[] pedidos; // Itens pedidos pelo cliente.
        String nome_cliente; 
        int qtd_itens; // Quantidade de itens que o cliente ira pedir.
        float preco_total = 0;
        
        dado = new DataInputStream(System.in);
        
        System.out.print("Digite seu nome: ");
        nome_cliente = dado.readLine();
        Linha();
        
        qtd_itens = PegaNum("Digite a quantidade de itens a serem pedidos: ");
        Linha();
        
        pedidos = new int[qtd_itens];
        
        // Escreve as opções para o cliente.
        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + " - " + produtos[i] + ", R$" + preco[i]);
        }
        
        Linha();
        
        // Cliente escolhe qual o numero do pedido.
        for (int i = 0; i < qtd_itens; i++) {
            pedidos[i] = PegaNum((i + 1) + " pedido: ");
        }
        
        
        for (int i = 0; i < qtd_itens; i++) {
            System.out.println(produtos[pedidos[i] - 1]);
            preco_total += preco[pedidos[i] - 1];
        }
        
        FileWriter arquivo = new FileWriter("Pedido " + nome_cliente);
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf("Nome do cliente: " + nome_cliente);
        gravar.printf("Valor total: " + preco_total);
        
        arquivo.close();
        
        System.out.println(preco_total);
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
