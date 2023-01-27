package com.example.domain.model;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class FactoryModel implements Serializable {
    private List<? extends Factory> ListaOficinas;

    private String RetornoErro;

    private String Token;

    public List<? extends Factory> getListaOficinas() {
        return this.ListaOficinas;
    }

    public void setListaOficinas(List<? extends Factory> ListaOficinas) {
        this.ListaOficinas = ListaOficinas;
    }
    public String getToken() {
        return this.Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public String getRetornoErro() {
        return this.RetornoErro;
    }

    public void setRetornoErro(String RetornoErro) {
        this.RetornoErro = RetornoErro;
    }


}

