/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assembleiarepublica;

import java.util.Date;

/**
 *
 * @author franc
 */
public class Votacao {
    
        private final int nVotacao;
        private final Date nomeData;
        private final String assunto;

        public Votacao(int nVotacao, Date nomeData, String assunto) {
            this.nVotacao = nVotacao;
            this.nomeData = nomeData;
            this.assunto = assunto;
        }

        public int getNVotacao() {
            return nVotacao;
        }

        public Date getNomeData() {
            return nomeData;
        }

        public String getAssunto() {
            return assunto;
        }
    }