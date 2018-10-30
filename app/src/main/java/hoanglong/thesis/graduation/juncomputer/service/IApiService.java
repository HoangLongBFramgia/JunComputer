package hoanglong.thesis.graduation.juncomputer.service;

import hoanglong.thesis.graduation.juncomputer.model.PhoneCategory;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IApiService {
    @GET("/getAllCategoryPhone")
    Call<PhoneCategory> getCategoryPhone();
}