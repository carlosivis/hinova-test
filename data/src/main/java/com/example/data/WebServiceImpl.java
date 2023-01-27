package com.example.data;

import com.example.data.request.ReferralRequest;
import com.example.data.response.Factory;
import com.example.domain.model.Referral;
import com.example.domain.repository.WebRepository;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class WebServiceImpl implements WebRepository {
    Service service = new Service();

    @Override
    public List<Factory> listFactory() {

        try {
            //TODO: mappers
            return Response.success(service.WebService().listFactory().request());
        } catch (Throwable throwable) {
            //TODO: make throwable
//            Response.error(throwable.toString())
        }
    }

    @Override
    public ReferralRequest postReferral(ReferralRequest referral) {
        try {
            //TODO: mappers
            return Response.success(service.WebService().referralSend(referral).request());
        } catch (Throwable throwable) {
            //TODO: make throwable
        }
    }
}
