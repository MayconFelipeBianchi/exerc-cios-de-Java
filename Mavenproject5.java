/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author aluno
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Bolinha";
        cachorro1.corOlhos = "azuis";
        cachorro1.peso = 30;
        cachorro1.quantPatas = 4;
        cachorro1.tamanho = 60;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Rex";
        cachorro2.corOlhos = "verde";
        cachorro2.peso = 50;
        cachorro2.quantPatas = 4;
        cachorro2.tamanho = 30;

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Tom";
        cachorro3.corOlhos = "verde";
        cachorro3.peso = 40;
        cachorro3.quantPatas = 4;
        cachorro3.tamanho = 60;

        Cachorro cachorro4 = new Cachorro();
        cachorro4.nome = "Jucelino";
        cachorro4.corOlhos = "azuis";
        cachorro4.peso = 60;
        cachorro4.quantPatas = 4;
        cachorro4.tamanho = 60;
        Cachorro cachorro5 = new Cachorro();
        cachorro5.nome = "Jusevaldo";
        cachorro5.corOlhos = "marrom";
        cachorro5.peso = 50;
        cachorro5.quantPatas = 4;
        cachorro5.tamanho = 60;

        cachorro1.latir();

    }
}
