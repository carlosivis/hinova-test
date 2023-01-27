package com.example.data;


import com.example.data.mappers.ModelMappers;
import com.example.domain.model.FactoryModel;
import com.example.domain.model.ReferralModel;
import com.example.domain.repository.WebRepository;

import okhttp3.Request;
import retrofit2.Response;

public class WebServiceImpl implements WebRepository {
    Service service = new Service();

    @Override
    public FactoryModel listFactory() {
        try {
             Response<Request> response = Response.success(service.WebService().listFactory().request());
             return (FactoryModel) new ModelMappers().map(response.body());

        } catch (Throwable t) {
            t.printStackTrace();
        }
        return null;
    }

    @Override
    public void postReferral(final ReferralModel referral) {
        try {
            Response.success(service.WebService().referralSend(new ModelMappers().map(referral)).execute());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
