package com.example.domain.model;


import java.util.Date;

public class Referral {
        private ClasseIndicacao Indicacao;
        private String Remetente;
        private String[] Copias ;

        public ClasseIndicacao getIndicacao() {
            return Indicacao;
        }

        public void setIndicacao(ClasseIndicacao indicacao) {
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


    public static class ClasseIndicacao
    {
        private int CodigoAssociacao ;
        public Date DataCriacao ;
        private String CpfAssociado ;
        private String EmailAssociado ;
        private String NomeAssociado ;
        private String TelefoneAssociado ;
        private String PlacaVeiculoAssociado ;
        private String NomeAmigo ;
        private String TelefoneAmigo ;
        private String EmailAmigo ;
        private String Observacao ;

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
}
