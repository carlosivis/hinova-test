package com.example.data.request;


import com.example.domain.model.ReferralModel;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ReferralRequest {
    @SerializedName("Indicacao")
    private Referral Indicacao;
    @SerializedName("Remetente")
    private String Remetente;
    @SerializedName("Copias")
    private String[] Copias;

    public Referral getIndicacao() {
        return Indicacao;
    }

    public void setIndicacao(Referral indicacao) {
        Indicacao = indicacao;
    }

    public String getRemetente() {
        return Remetente;
    }

    public void setRemetente(String remetente) {
        Remetente = remetente;
    }

    public String[] getCopias() {
        return Copias;
    }

    public void setCopias(String[] copias) {
        Copias = copias;
    }



}
