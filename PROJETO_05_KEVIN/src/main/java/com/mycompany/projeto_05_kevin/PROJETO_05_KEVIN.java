/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_05_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_05_KEVIN {

    public static void main(String[] args) throws IOException {
        int tempo;
        
        tempo = PegaNum("Digite a quantidade de segundos para a finalizacao do processo: ");
        
        Fechar(tempo); // Mostra quantos segundos faltam para fechar o processo.
    }
    
    public static void Fechar(int tempo) throws IOException {
        DataInputStream dado;
        String s;
        
        // Pede para o usuario sair.
        while (true) {
            Linha();
            System.out.print("Digite 'SAIR' para fechar o processo: ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            
            if (s.equals("SAIR")) {
                break;
            }
        }
        
        Linha();
        System.out.println("Saindo em:");
        Linha();
        
        for (int i = tempo; i > 0; i--) {
            System.out.println(i);
        }
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
                    System.out.println("Digite um numero inteiro positivo maior que zero.");
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
