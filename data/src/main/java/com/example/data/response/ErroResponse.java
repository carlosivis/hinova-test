package com.example.data.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ErroResponse implements Serializable {

    @SerializedName("retornoErro")
    private String retornoErro;

        public String getRetornoErro() {
            return this.retornoErro;
        }

        public void setRetornoErro(String retornoErro) {
            this.retornoErro = retornoErro;
        }
}
