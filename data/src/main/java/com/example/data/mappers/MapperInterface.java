package com.example.data.mappers;

import com.example.data.request.ReferralRequest;
import com.example.data.response.FactoryResponse;
import com.example.domain.model.Factory;
import com.example.domain.model.FactoryModel;
import com.example.domain.model.Referral;
import com.example.domain.model.ReferralModel;

public interface MapperInterface<From, To> {

    ReferralRequest map(ReferralModel value);

    com.example.data.request.Referral map(Referral value);

    To map(From value);

    Factory map(com.example.data.response.Factory value);

    FactoryModel map(FactoryResponse value);
}

