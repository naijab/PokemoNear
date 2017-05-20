package com.naijab.pokemonear.network;

import com.naijab.pokemonear.login.UserLoginModel;
import com.naijab.pokemonear.maps.PokemonCatchableModel;
import com.naijab.pokemonear.server.ServerStatusModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

// TODO ไม่ได้ใช้ก็ลบเถอะ ดูเหมือนว่าจะซ้ำกับ PokemonServerService
public interface ServiceInterface {

    @GET("pokemon")
    Call<ServerStatusModel> getServerStatus();

    @FormUrlEncoded
    @POST("pokemon/login")
    Call<UserLoginModel> getUserLogin(@Field("email") String email,
                                      @Field("password") String password);

    @GET("pokemon/catchable")
    Call<PokemonCatchableModel> getPokemon(@Header("pokemon_token") String token,
                                           @Query("latitude") String latitude,
                                           @Query("longitude") String longitude);
}
