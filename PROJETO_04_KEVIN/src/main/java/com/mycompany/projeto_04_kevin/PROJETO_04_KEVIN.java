/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_04_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_04_KEVIN {

    public static void main(String[] args) throws IOException {
        int num;
        
        num = PegaNum("Digite um numero para mostrar sua tabuada: ");
        Linha();
        
        Tabuada(num); // Mostra a tabuada.
    }
    
    // Faz a tabuada.
    public static void Tabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
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
