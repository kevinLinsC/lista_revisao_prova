/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_08_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_08_KEVIN {

    public static void main(String[] args) throws IOException {
        float nota;
        float media = 0;
        int qtd_notas;
        
        qtd_notas = PegaNum("Digite a quantidade de notas: "); // quantidade de notas a serem solicitadas.
        Linha();
        
        // Pega 'qtd_notas' notas.
        for (int i = 1; i <= qtd_notas; i++) {
            nota = PegaNota("Digite a " + i + " nota: ");
            media += nota;
        }
         
        media = media / qtd_notas;
        
        Linha();
        System.out.println("A media do aluno e: " + media);
        Linha();
        Aprovado_ou_reprovado(media);
    }
    
    public static void Aprovado_ou_reprovado(float media) {
        if (media >= 6) {
            System.out.println("O aluno esta aprovado.");
        }
        else {
            System.out.println("O aluno esta reprovado.");
        }
    }
    
    // Pega o número, filtrando os erros.
    public static float PegaNota(String texto) throws IOException {
        DataInputStream dado;
        String s;
        float num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            
            try {
                num = Float.parseFloat(s); // Converte para float.
                if (num >= 0) {
                    break;
                }
                else {
                    System.out.println("Digite uma nota positva.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite uma nota valida.");
                Linha();
            }
        }
        
        return num;
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
                    System.out.println("Digite um tamanho para o vetor valido.");
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
