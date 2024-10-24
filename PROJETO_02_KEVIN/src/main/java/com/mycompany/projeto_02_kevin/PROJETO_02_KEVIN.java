/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_02_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_02_KEVIN {

    public static void main(String[] args) throws IOException {
        int estoque;
        
        estoque = PegaNum("Digite a quantidade de itens no estoque: "); // Pega o número de itens do produto no estoque.
        Linha();
        
        Par_ou_impar(estoque); // Mostra se é par ou ímpar.
    }
    
    // Verifica se o número é par ou impar.
    public static void Par_ou_impar(int num) {
        if (num == 0) { // Se o produto estiver com o estoque zerado não entrará no calculo.
            System.out.println("O produto esta fora de estoque, por isso nao e par ou impar");
        }
        else if (num % 2 == 0) { // Par.
            System.out.println("O numero de itens no estoque e par.");
        }
        else if (num % 2 != 0) { // Ímpar.
            System.out.println("O numero de itens no estoque e impar.");
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
                if (num >= 0) { // Se não ocorrer erros e o numero for maior ou igual a zero, o loop se encerra.
                    break; 
                }
                else {
                    System.out.println("A quantidade no estoque nao pode ser negativa.");
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
