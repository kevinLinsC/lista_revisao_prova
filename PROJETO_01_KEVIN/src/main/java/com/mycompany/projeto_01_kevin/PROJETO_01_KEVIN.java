/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_01_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_01_KEVIN {

    public static void main(String[] args) throws IOException {
        float pri_num;
        float seg_num;
        float soma;
        
        System.out.println("Bem-vindo a calculadora rapida.");
        Linha();
        
        pri_num = PegaNum("Digite o primeiro numero: "); // Primeiro número.
        seg_num = PegaNum("Digite o segundo numero: "); // Segundo número.
        Linha();
        
        soma = Soma(pri_num, seg_num);
        System.out.println("A soma entre " + pri_num + " e " + seg_num + " e: " + soma); // Mostra a soma entre os dois números.
    }
    
    // Pega o número, filtrando os erros.
    public static float PegaNum(String texto) throws IOException {
        DataInputStream dado;
        String s;
        float num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            try {
                num = Float.parseFloat(s); // Converte para inteiro.
                break; // Se não ocorrer erros o loop se encerra.
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero valido.");
                Linha();
            }
       
        }
        
        return num;
    }
    
    // Soma dois números.
    public static float Soma(float pri_num, float seg_num) {
        return pri_num + seg_num;
    }
    
    // Escreve uma linha.
    public static void Linha() {
        System.out.println("------------------------------");
    }
}
