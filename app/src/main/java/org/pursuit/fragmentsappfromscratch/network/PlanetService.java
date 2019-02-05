package org.pursuit.fragmentsappfromscratch.network;

import org.pursuit.fragmentsappfromscratch.model.Planets;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PlanetService {
    @GET("JDVila/storybook/master/planets.json")
    Call<Planets> getPlanetList();
}
