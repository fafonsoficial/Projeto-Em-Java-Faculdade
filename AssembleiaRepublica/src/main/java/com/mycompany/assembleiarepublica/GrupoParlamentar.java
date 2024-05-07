/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assembleiarepublica;

/**
 *
 * @author franc
 */
public class GrupoParlamentar {
 
    // Atributos
    private String nome;
    private int nDeputados;

    // Construtor
    public GrupoParlamentar(String nome, int nDeputados) {
        this.nome = nome;
        this.nDeputados = nDeputados;
    }

    // Getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNDeputados() {
        return nDeputados;
    }

    public void setNDeputados(int nDeputados) {
        this.nDeputados = nDeputados;
    }

    // Método toString() para imprimir informações do grupo
    @Override
    public String toString() {
        return "Grupo Parlamentar: " + nome + " (" + nDeputados + " deputados)";
    }
}

