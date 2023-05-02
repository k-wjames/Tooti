package ke.co.kodelite.tooti;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AirtimeInterface {
    @FormUrlEncoded
    @POST("send")
    Call<AirtimeResponse> send(@Field("username") String username, @Field("recipients") String recipients, @Field("maxNumRetry") String maxNumRetry);
}
