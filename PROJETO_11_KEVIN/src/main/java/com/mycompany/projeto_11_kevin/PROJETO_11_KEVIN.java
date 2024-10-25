/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_11_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_11_KEVIN {

    public static void main(String[] args) throws IOException {
        int[] num;
        int qtd_numeros;
        int maior;
        int menor;
        
        // Pede quantos numeros irão ser digitado e inicializa o vetor.
        qtd_numeros = PegaNum("Digite a quantidade de numeros a serem digitados: ");
        num = new int[qtd_numeros];
        Linha();
        
        // Pega os números.
        for (int i = 0; i < qtd_numeros; i++) {
            num[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
        }
        
        // Inicializa o maior e menor com o primeiro número.
        maior = num[0];
        menor = num[0];
        
        // Pega o menor e o maior número.
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }
            else if (num[i] < menor) {
                menor = num[i];
            }
        }
        
        Linha();
        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("O menor numero digitado foi: " + menor);
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
