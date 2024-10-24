/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_03_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_03_KEVIN {

    public static void main(String[] args) throws IOException {
        int jogador_um;
        int jogador_dois;
        
        jogador_um = PegaNum("Digite a pontuacao do primeiro jogador: ");
        Linha();
        
        jogador_dois = PegaNum("Digite a pontuacao do segundo jogador: ");
        Linha();
        
        Ganhador(jogador_um, jogador_dois); // Mostrar qual jogador ganhou.
    }
    
    public static void Ganhador(int jogador_um, int jogador_dois) {
        if (jogador_um == jogador_dois) {
            System.out.println("Deu empate entre os jogadores.");
        }
        else if (jogador_um > jogador_dois) {
            System.out.println("Primeiro jogador ficou com mais pontos e ganhou a partida!");
        }
        else if (jogador_dois > jogador_um) {
            System.out.println("Segundo jogador ficou com mais pontos e ganhou a partida!");
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
