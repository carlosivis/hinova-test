package com.example.data;

import com.example.data.request.ReferralRequest;
import com.example.data.response.FactoryResponse;
import com.example.data.utils.Constants;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface WebServiceInterface {

    @GET(Constants.FACTORY)
    Call<FactoryResponse> listFactory();

    @Headers("Content-type: \"application/json\"")
    @POST(Constants.REFERRAL)
    Call<ReferralRequest> referralSend(@Body ReferralRequest referral);
}
