/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assembleiarepublica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author franc
 */
public class Voto {

    // Atributos
    private int nVotacao;
    private Date dataVotacao;
    private String assunto;
    private List<VotoIndividual> votosIndividuais;

    // Construtor
    public Voto(int nVotacao, Date dataVotacao, String assunto) {
        this.nVotacao = nVotacao;
        this.dataVotacao = dataVotacao;
        this.assunto = assunto;
        this.votosIndividuais = new ArrayList<>();
    }

    // Getters e setters para os atributos
    public int getNVotacao() {
        return nVotacao;
    }

    public void setNVotacao(int nVotacao) {
        this.nVotacao = nVotacao;
    }

    public Date getDataVotacao() {
        return dataVotacao;
    }

    public void setDataVotacao(Date dataVotacao) {
        this.dataVotacao = dataVotacao;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public List<VotoIndividual> getVotosIndividuais() {
        return votosIndividuais;
    }

    // Método para adicionar um voto individual
    public void adicionarVotoIndividual(VotoIndividual votoIndividual) {
        votosIndividuais.add(votoIndividual);
    }

    // Método para calcular o resultado da votação (favorável, contra, abstenção)
    public ResultadoVotacao calcularResultado() {
        int votosFavoraveis = 0;
        int votosContra = 0;
        int abstencoes = 0;

        for (VotoIndividual voto : votosIndividuais) {
            switch (voto.getVoto()) {
                case FAVORAVEL:
                    votosFavoraveis++;
                    break;
                case CONTRA:
                    votosContra++;
                    break;
                case ABSTENCAO:
                    abstencoes++;
                    break;
            }
        }

        if (votosFavoraveis > votosContra) {
            return ResultadoVotacao.FAVORAVEL;
        } else if (votosContra > votosFavoraveis) {
            return ResultadoVotacao.CONTRA;
        } else {
            return ResultadoVotacao.EMPATE;
        }
    }

    // Método toString() para imprimir informações da votação
    @Override
    public String toString() {
        return "Voto #" + nVotacao + ": " + assunto + " (" + dataVotacao + ")";
    }
}

// Enum para representar os resultados da votação
enum ResultadoVotacao {
    FAVORAVEL, CONTRA, EMPATE;
}

// Classe para representar um voto individual
class VotoIndividual {

    private GrupoDeputado deputado;
    private VotoEnum voto;

    public VotoIndividual(GrupoDeputado deputado, VotoEnum voto) {
        this.deputado = deputado;
        this.voto = voto;
    }

    public GrupoDeputado getGrupoDeputado() {
        return deputado;
    }

    public void setGrupoDeputado(GrupoDeputado deputado) {
        this.deputado = deputado;
    }

    public VotoEnum getVoto() {
        return voto;
    }

    public void setVoto(VotoEnum voto) {
        this.voto = voto;
    }
}

// Enum para representar os tipos de voto individual
enum VotoEnum {
    FAVORAVEL, CONTRA, ABSTENCAO;
}

