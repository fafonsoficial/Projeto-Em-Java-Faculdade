/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assembleiarepublica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
class GrupoDeputado {

    // Atributos
    private String nome;
    private int nDeputados;
    private List<GrupoDeputado> deputados;

    // Construtor
    public GrupoDeputado(String nome, int nDeputados) {
        this.nome = nome;
        this.nDeputados = nDeputados;
        this.deputados = new ArrayList<>();
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

    public List<GrupoDeputado> getDeputados() {
        return deputados;
    }

    // Método para adicionar um deputado ao grupo
    public void adicionarDeputado(GrupoDeputado deputado) {
        deputados.add(deputado);
        nDeputados++; // Atualiza o número de deputados
    }

    // Método para remover um deputado do grupo
    public void removerDeputado(GrupoDeputado deputado) {
        deputados.remove(deputado);
        nDeputados--; // Atualiza o número de deputados
    }

    // Método toString() para imprimir informações do grupo
    @Override
    public String toString() {
        return "Grupo Deputado: " + nome + " (" + nDeputados + " deputados)";
    }
}
