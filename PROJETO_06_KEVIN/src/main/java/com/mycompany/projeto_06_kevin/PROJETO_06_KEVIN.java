/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_06_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_06_KEVIN {

    public static void main(String[] args) throws IOException {
        
        float nota;
        float media = 0;
        int qtd_notas = 3;
        
        // Pega 'qtd_notas' notas;
        for (int i = 1; i <= qtd_notas; i++) {
            nota = PegaNota("Digite a " + i + " nota: ");
            media += nota;
        }
         
        media = media / qtd_notas;
        
        Linha();
        System.out.println("A media do funcionario e: " + media);
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
                    System.out.println("Digite uma nota positiva.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite uma nota valida.");
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
