/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assembleiarepublica;

import java.util.Date; // serve par aimportar 
import java.util.ArrayList; // serve para importar o ArrayList
import java.util.List; // serve para importar 
/**
 *
 * @author franc
 */
public class Assembleia {
  
    // Atributos
    private static Date dataInicio;
    private final int nTotalDeputados;
    private static List<Componente> componentes;
    private final List<GrupoParlamentar> grupoParlamentar;
    private final List<GrupoDeputado> grupoDeputado;
    private final List<Votacao> votacoes;
    

    // Construtor
    public Assembleia(Date dataInicio, int nTotalDeputados) {
        this.dataInicio = dataInicio;
        this.nTotalDeputados = nTotalDeputados;
        this.componentes = new ArrayList<>();
        this.votacoes = new ArrayList<>();
        this.grupoParlamentar = grupoParlamentar;
    }

    // Métodos
    
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public void registarComp(String nomeGrupo, int nDep) {
        Componente componentes = new Componente(nomeGrupo, nDep);
        componentes.add(componentes);
    }
    
    public boolean verificaTotDep() {
    int totalDeputadosRegistrados = 0;
    for (Componente componente : componentes) {
        totalDeputadosRegistrados += componente.getNDep();
    }
    return totalDeputadosRegistrados == nTotalDeputados;
    }
    
    public void printComposicao() {
        System.out.println("Composição da Assembleia:");
            for (Componente componente : componentes) {
        System.out.println("- " + componente.getNomeGrupo() + " (" + componente.getNDep() + " deputados)");
    }
}
    
    public void print() {
        System.out.println("Assembleia:");
        System.out.println("- Data de início: " + dataInicio);
        System.out.println("- Número total de deputados: " + nTotalDeputados);
        System.out.println("- Votações:");
            for (Votacao votacao : votacoes) {
        System.out.println("  - " + votacao.getNVotacao() + ": " + votacao.getAssunto() + " (" + votacao.getNomeData() + ")");
    }
}
    
    
}


