package com.example.domain.model;

import java.io.Serializable;

public class ErroModel implements Serializable {
    private String retornoErro;

        public String getRetornoErro() {
            return this.retornoErro;
        }

        public void setRetornoErro(String retornoErro) {
            this.retornoErro = retornoErro;
        }
}
