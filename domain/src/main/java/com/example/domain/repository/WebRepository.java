package com.example.domain.repository;


import com.example.domain.model.FactoryModel;
import com.example.domain.model.ReferralModel;

public interface WebRepository {

    public FactoryModel listFactory();
    public void postReferral(ReferralModel referral);
}
