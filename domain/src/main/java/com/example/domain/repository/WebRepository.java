package com.example.domain.repository;


import com.example.data.request.ReferralRequest;
import com.example.data.response.Factory;

import java.util.List;

public interface WebRepository {

    public List<Factory> listFactory();
    public ReferralRequest postReferral(ReferralRequest referral);
}
