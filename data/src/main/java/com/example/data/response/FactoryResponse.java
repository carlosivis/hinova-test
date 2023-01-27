package com.example.data.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class FactoryResponse implements Serializable {
    @SerializedName("ListaOficinas")
    private List<? extends Factory> ListaOficinas;

    @SerializedName("RetornoErro")
    private String RetornoErro;

    @SerializedName("Token")
    private String Token;

    public List<? extends Factory> getListaOficinas() {
        return this.ListaOficinas;
    }

    public void setListaOficinas(List<? extends Factory> ListaOficinas) {
        this.ListaOficinas = ListaOficinas;
    }

    public String getRetornoErro() {
        return this.RetornoErro;
    }

    public void setRetornoErro(String RetornoErro) {
        this.RetornoErro = RetornoErro;
    }

    public String getToken() {
        return this.Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

}

