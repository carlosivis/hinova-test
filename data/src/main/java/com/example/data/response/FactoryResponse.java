package com.example.data.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class FactoryResponse implements Serializable {
    @SerializedName("ListaOficinas")private List<? extends Factory> ListaOficinas;

    @SerializedName("RetornoErro")private ErroResponse RetornoErro;

    @SerializedName("Token")private Token Token;

    public List<? extends Factory> getListaOficinas() {
        return this.ListaOficinas;
    }

    public void setListaOficinas(List<? extends Factory> ListaOficinas) {
        this.ListaOficinas = ListaOficinas;
    }

    public ErroResponse getRetornoErro() {
        return this.RetornoErro;
    }

    public void setRetornoErro(ErroResponse RetornoErro) {
        this.RetornoErro = RetornoErro;
    }




}

