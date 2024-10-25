/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_07_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_07_KEVIN {

    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        int qtd_itens;
        String[] itens;
        int item_buscado;
        
        // Inicia o elemento com a escolha do usuario.
        qtd_itens = PegaNum("Digite a quantidade de itens: ");
        itens = new String[qtd_itens];
        Linha();
        
        // Usuário preenche o vetor com nome dos itens.
        dado = new DataInputStream(System.in);
        for (int i = 0; i < qtd_itens; i++) {
            System.out.print("Digite o nome do " + i + " item: ");
            itens[i] = dado.readLine();
        }

        // Pede o codigo do item para ver se esta presente no inventario, sai quando o usuario digita -1.
        while (true) {
            Linha();
            item_buscado = PegaNum("Digite um codigo para procurar no inventario (-1 - sair): ");
            if (item_buscado == -1) {
                break;
            }
            
            if (item_buscado < qtd_itens) {
            System.out.println("O item '" + itens[item_buscado] + "' esta no inventario.");
            }
            else {
                System.out.println("O item nao esta presente no inventario.");
            }
        }
        Linha();
        System.out.println("Fim do programa.");
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
                if (num >= -1) {
                    break; 
                }
                else {
                    System.out.println("Digite um numero maior que zero.");
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
