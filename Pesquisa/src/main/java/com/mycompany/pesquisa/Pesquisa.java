/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pesquisa;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Pesquisa {

    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int chave = Integer.parseInt(JOptionPane.showInputDialog("Infrome o número a ser pesquisado"));

        int posicao = pesquisaLinear(chave, vetor);

        if (posicao >= 0) {
            System.out.println("O elemento " + chave +" está localizado na posição: " + posicao
          
            );
        }
        else{
            System.out.println("O elemento " + chave + "não foi localisado na lista");
        }
    }

    /***
     * 
     * @param chave
     * @param vet
     * @return 
     */
    public static int pesquisaLinear(int chave, int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            if (chave == vet[i]) {
                return i;
            }

        }

        return -1;

    }
}
