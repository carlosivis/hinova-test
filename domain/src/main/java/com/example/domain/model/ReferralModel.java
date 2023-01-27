package com.example.domain.model;

package com.example.hinova.domain.model;

import java.io.Serializable;
import java.lang.String;

public class ReferralModel implements Serializable {
    private String Remetente;

    private Indicacao Indicacao;

    public String getRemetente() {
        return this.Remetente;
    }

    public void setRemetente(String Remetente) {
        this.Remetente = Remetente;
    }

    public Indicacao getIndicacao() {
        return this.Indicacao;
    }

    public void setIndicacao(Indicacao Indicacao) {
        this.Indicacao = Indicacao;
    }

    public static class Indicacao implements Serializable {
        private String NomeAssociado;

        private String TelefoneAmigo;

        private String DataCriacao;

        private String EmailAssociado;

        private String TelefoneAssociado;

        private String PlacaVeiculoAssociado;

        private String NomeAmigo;

        private String EmailAmigo;

        private String CodigoAssociacao;

        private String CpfAssociado;

        public String getNomeAssociado() {
            return this.NomeAssociado;
        }

        public void setNomeAssociado(String NomeAssociado) {
            this.NomeAssociado = NomeAssociado;
        }

        public String getTelefoneAmigo() {
            return this.TelefoneAmigo;
        }

        public void setTelefoneAmigo(String TelefoneAmigo) {
            this.TelefoneAmigo = TelefoneAmigo;
        }

        public String getDataCriacao() {
            return this.DataCriacao;
        }

        public void setDataCriacao(String DataCriacao) {
            this.DataCriacao = DataCriacao;
        }

        public String getEmailAssociado() {
            return this.EmailAssociado;
        }

        public void setEmailAssociado(String EmailAssociado) {
            this.EmailAssociado = EmailAssociado;
        }

        public String getTelefoneAssociado() {
            return this.TelefoneAssociado;
        }

        public void setTelefoneAssociado(String TelefoneAssociado) {
            this.TelefoneAssociado = TelefoneAssociado;
        }

        public String getPlacaVeiculoAssociado() {
            return this.PlacaVeiculoAssociado;
        }

        public void setPlacaVeiculoAssociado(String PlacaVeiculoAssociado) {
            this.PlacaVeiculoAssociado = PlacaVeiculoAssociado;
        }

        public String getNomeAmigo() {
            return this.NomeAmigo;
        }

        public void setNomeAmigo(String NomeAmigo) {
            this.NomeAmigo = NomeAmigo;
        }

        public String getEmailAmigo() {
            return this.EmailAmigo;
        }

        public void setEmailAmigo(String EmailAmigo) {
            this.EmailAmigo = EmailAmigo;
        }

        public String getCodigoAssociacao() {
            return this.CodigoAssociacao;
        }

        public void setCodigoAssociacao(String CodigoAssociacao) {
            this.CodigoAssociacao = CodigoAssociacao;
        }

        public String getCpfAssociado() {
            return this.CpfAssociado;
        }

        public void setCpfAssociado(String CpfAssociado) {
            this.CpfAssociado = CpfAssociado;
        }
    }
}

