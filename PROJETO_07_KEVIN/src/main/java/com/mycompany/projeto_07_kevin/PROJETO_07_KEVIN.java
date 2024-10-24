/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_07_kevin;

import java.io.DataInputStream;
import java.io.IOException;
gfd
/**
 *
 * @author k.andrade
 */
public class PROJETO_07_KEVIN {

    public static void main(String[] args) throws IOException {
        int qtd_itens;
        
        qtd_itens = PegaNum("Digite a quantidade de elementos: ");
        
        
        int[] itens = new int[qtd_itens];
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
                break; 
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
