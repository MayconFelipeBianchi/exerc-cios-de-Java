/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author aluno
 */
public class Cachorro {

    public String nome;
    public int peso;
    public String corOlhos;
    public int quantPatas;
    int tamanho;

    public void latir() {
        if (tamanho > 60) {
            System.out.println("woooof, wooof!!");
        } else if (tamanho > 14) {
            System.out.println("Ruff, Ruff!!");
        } else {
            System.out.println("yip, yip!!");
        }
    }
}
