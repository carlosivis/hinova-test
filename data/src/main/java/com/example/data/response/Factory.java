package com.example.data.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Factory implements Serializable {

    @SerializedName("Email")
    private String Email;

    @SerializedName("DescricaoCurta")
    private String DescricaoCurta;

    @SerializedName("Foto")
    private String Foto;

    @SerializedName("Ativo")
    private Boolean Ativo;

    @SerializedName("Latitude")
    private String Latitude;

    @SerializedName("CodigoAssociacao")
    private Integer CodigoAssociacao;

    @SerializedName("Longitude")
    private String Longitude;

    @SerializedName("Endereco")
    private String Endereco;

    @SerializedName("AvaliacaoUsuario")
    private Integer AvaliacaoUsuario;

    @SerializedName("Telefone1")
    private String Telefone1;

    @SerializedName("Descricao")
    private String Descricao;

    @SerializedName("Id")
    private Integer Id;

    @SerializedName("Nome")
    private String Nome;

    @SerializedName("Telefone2")
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

