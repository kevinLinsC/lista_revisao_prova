/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_10_kevin;

import java.io.DataInputStream;
import java.io.IOException;
dsada
/**
 *
 * @author k.andrade
 */
public class PROJETO_10_KEVIN {

    public static void main(String[] args) throws IOException {
        int qtd_clientes;
        String[] respostas_cliente;
        
        qtd_clientes = PegaNum("Digite a quantidade de participantes: ");
        
        respostas_cliente = Resp_cliente(qtd_clientes);
        
    }
    
    public static String[] Resp_cliente(int qtd_clientes) throws IOException {
        DataInputStream dado;
        
        String[] resp_cliente = new String[qtd_clientes]; // Vetor com 'qtd_clientes' de tamanho.
        
        // Pega o genero favorito de todos os clientes.
        for (int i = 0; i < qtd_clientes; i++) {
            System.out.print("Escreva seu genero de filme favorito: ");
            dado = new DataInputStream(System.in);
            resp_cliente[i] = dado.readLine(); 
        }
        
        return resp_cliente;
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
