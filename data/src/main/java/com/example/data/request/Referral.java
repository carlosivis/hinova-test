package com.example.data.request;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Referral {
        @SerializedName("CodigoAssociacao")
        private int CodigoAssociacao;
        public Date DataCriacao;
        @SerializedName("CpfAssociado")
        private String CpfAssociado;
        @SerializedName("EmailAssociado")
        private String EmailAssociado;
        @SerializedName("NomeAssociado")
        private String NomeAssociado;
        @SerializedName("TelefoneAssociado")
        private String TelefoneAssociado;
        @SerializedName("PlacaVeiculoAssociado")
        private String PlacaVeiculoAssociado;
        @SerializedName("NomeAmigo")
        private String NomeAmigo;
        @SerializedName("TelefoneAmigo")
        private String TelefoneAmigo;
        @SerializedName("EmailAmigo")
        private String EmailAmigo;
        @SerializedName("Observacao")
        private String Observacao;

        public int getCodigoAssociacao() {
            return CodigoAssociacao;
        }

        public void setCodigoAssociacao(int codigoAssociacao) {
            CodigoAssociacao = codigoAssociacao;
        }

        public String getCpfAssociado() {
            return CpfAssociado;
        }

        public void setCpfAssociado(String cpfAssociado) {
            CpfAssociado = cpfAssociado;
        }

        public String getEmailAssociado() {
            return EmailAssociado;
        }

        public void setEmailAssociado(String emailAssociado) {
            EmailAssociado = emailAssociado;
        }

        public String getNomeAssociado() {
            return NomeAssociado;
        }

        public void setNomeAssociado(String nomeAssociado) {
            NomeAssociado = nomeAssociado;
        }

        public String getTelefoneAssociado() {
            return TelefoneAssociado;
        }

        public void setTelefoneAssociado(String telefoneAssociado) {
            TelefoneAssociado = telefoneAssociado;
        }

        public String getPlacaVeiculoAssociado() {
            return PlacaVeiculoAssociado;
        }

        public void setPlacaVeiculoAssociado(String placaVeiculoAssociado) {
            PlacaVeiculoAssociado = placaVeiculoAssociado;
        }

        public String getNomeAmigo() {
            return NomeAmigo;
        }

        public void setNomeAmigo(String nomeAmigo) {
            NomeAmigo = nomeAmigo;
        }

        public String getTelefoneAmigo() {
            return TelefoneAmigo;
        }

        public void setTelefoneAmigo(String telefoneAmigo) {
            TelefoneAmigo = telefoneAmigo;
        }

        public String getEmailAmigo() {
            return EmailAmigo;
        }

        public void setEmailAmigo(String emailAmigo) {
            EmailAmigo = emailAmigo;
        }

        public String getObservacao() {
            return Observacao;
        }

        public void setObservacao(String observacao) {
            Observacao = observacao;
        }
}
