/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_10_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_10_KEVIN {

    public static void main(String[] args) throws IOException {
        int qtd_clientes;
        String[] generos = {"Acao", "Aventura", "Comedia", "Drama", "Espionagem", "Fantasia",
                            "Ficcao cientifica", "Musical", "Romance", "Terror"};
        int[] cont_genero = new int[generos.length];
        int[] respostas_cliente;
        int escolha;
        
        // Pergunta quantos participantes terao e inicia o vetor.
        qtd_clientes = PegaNum("Digite a quantidade de participantes: ");
        respostas_cliente = new int[qtd_clientes];
        Linha();
        
        // Mostra os generos disponiveis.
        for (int i = 0; i < generos.length; i++) {
            System.out.println((i + 1) + " - " + generos[i]);
        }
        Linha();
        
        // Pega as respostas dos participantes.
        for (int i = 0; i < qtd_clientes; i++) {
            escolha = PegaNum((i + 1) + " participante: ");
            if (escolha > 0 && escolha < generos.length) {
                respostas_cliente[i] = escolha;
            }
        }
        
        // Conta quantas pessoas escolheram cada genero.
        for (int i = 0; i < qtd_clientes; i++) {
            cont_genero[respostas_cliente[i] - 1]++;
        }
        
    }
    
    /*
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
    */
    
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
                    Linha();
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
