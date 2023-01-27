package com.example.data.mappers;

import com.example.data.request.ReferralRequest;
import com.example.data.response.FactoryResponse;
import com.example.domain.model.Factory;
import com.example.domain.model.FactoryModel;
import com.example.domain.model.Referral;
import com.example.domain.model.ReferralModel;

import java.util.List;

public final class ModelMappers implements MapperInterface {


    @Override
    public ReferralRequest map(ReferralModel value) {
        ReferralRequest model = new ReferralRequest();
        model.setRemetente(value.getRemetente());
        model.setCopias(value.getCopias());
        model.setIndicacao(map(value.getIndicacao()));
        return model;
    }

    @Override
    public com.example.data.request.Referral map(Referral value) {
        com.example.data.request.Referral model = new com.example.data.request.Referral();
        model.setCodigoAssociacao(value.getCodigoAssociacao());
        model.setCpfAssociado(value.getCpfAssociado());
        model.setEmailAmigo(value.getEmailAmigo());
        model.setEmailAssociado(value.getEmailAssociado());
        model.setObservacao(value.getObservacao());
        model.setNomeAmigo(value.getNomeAmigo());
        model.setNomeAssociado(value.getNomeAssociado());
        model.setTelefoneAmigo(value.getTelefoneAmigo());
        model.setTelefoneAssociado(value.getTelefoneAssociado());
        model.setPlacaVeiculoAssociado(value.getPlacaVeiculoAssociado());
        return model;
    }

    @Override
    public Factory map(com.example.data.response.Factory value) {
        Factory model = new Factory();
        model.setAtivo(value.getAtivo());
        model.setAvaliacaoUsuario(value.getAvaliacaoUsuario());
        model.setId(value.getId());
        model.setDescricao(value.getDescricao());
        model.setEmail(value.getEmail());
        model.setEndereco(value.getEndereco());
        model.setFoto(value.getFoto());
        model.setLatitude(value.getLatitude());
        model.setDescricaoCurta(value.getDescricaoCurta());
        model.setLongitude(value.getLongitude());
        model.setNome(value.getNome());
        model.setTelefone1(value.getTelefone1());
        model.setTelefone2(value.getTelefone2());
        model.setCodigoAssociacao(value.getCodigoAssociacao());

        return model;
    }

    @Override
    public FactoryModel map(FactoryResponse value) {

        FactoryModel model = new FactoryModel();
        model.setToken(value.getToken());
        model.setListaOficinas((List<? extends Factory>) map(value.getListaOficinas()));
        model.setRetornoErro(value.getRetornoErro());
        return model;
    }

    @Override
    public Object map(Object value) {
        return null;
    }
}
