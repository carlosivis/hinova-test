package com.example.domain.model;

import java.io.Serializable;

public class Factory implements Serializable {
    private String Email;

    private String DescricaoCurta;

    private String Foto;

    private Boolean Ativo;

    private String Latitude;

    private Integer CodigoAssociacao;

    private String Longitude;

    private String Endereco;

    private Integer AvaliacaoUsuario;

    private String Telefone1;

    private String Descricao;

    private Integer Id;

    private String Nome;

    private Object Telefone2;

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDescricaoCurta() {
        return this.DescricaoCurta;
    }

    public void setDescricaoCurta(String DescricaoCurta) {
        this.DescricaoCurta = DescricaoCurta;
    }

    public String getFoto() {
        return this.Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public Boolean getAtivo() {
        return this.Ativo;
    }

    public void setAtivo(Boolean Ativo) {
        this.Ativo = Ativo;
    }

    public String getLatitude() {
        return this.Latitude;
    }

    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    public Integer getCodigoAssociacao() {
        return this.CodigoAssociacao;
    }

    public void setCodigoAssociacao(Integer CodigoAssociacao) {
        this.CodigoAssociacao = CodigoAssociacao;
    }

    public String getLongitude() {
        return this.Longitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public Integer getAvaliacaoUsuario() {
        return this.AvaliacaoUsuario;
    }

    public void setAvaliacaoUsuario(Integer AvaliacaoUsuario) {
        this.AvaliacaoUsuario = AvaliacaoUsuario;
    }

    public String getTelefone1() {
        return this.Telefone1;
    }

    public void setTelefone1(String Telefone1) {
        this.Telefone1 = Telefone1;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Object getTelefone2() {
        return this.Telefone2;
    }

    public void setTelefone2(Object Telefone2) {
        this.Telefone2 = Telefone2;
    }
}
