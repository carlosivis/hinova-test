package com.example.domain.model;

import java.io.Serializable;

public class ReferralModel implements Serializable {
    private String Remetente;
    private Referral Indicacao;
    private String[] Copias;

    public String getRemetente() {
        return this.Remetente;
    }

    public void setRemetente(String Remetente) {
        this.Remetente = Remetente;
    }

    public String[] getCopias() {
        return Copias;
    }

    public void setCopias(String[] copias) {
        Copias = copias;
    }

    public Referral getIndicacao() {
        return Indicacao;
    }

    public void setIndicacao(Referral indicacao) {
        Indicacao = indicacao;
    }


}

