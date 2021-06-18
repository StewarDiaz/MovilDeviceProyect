package com.programmingjd.movildeviceproyect.apiManager;

import com.programmingjd.movildeviceproyect.models.picsum_info;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface Api {

    String BASE_URL = "https://picsum.photos/";

    @GET("v2/list")
    Call<List<picsum_info>> getPicsum_info_list();

    //ENDPOINT RANDOM
    String random = "1080/720";

    //ENDPOINT RANDOM
    String randomGray = "1080/720?grayscale";

    //ENDPOINT RANDOM
    String randomBlur = "1080/720/?blur";

}
