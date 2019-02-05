package org.pursuit.fragmentsappfromscratch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.pursuit.fragmentsappfromscratch.controller.FAFSAdapter;
import org.pursuit.fragmentsappfromscratch.model.Planets;
import org.pursuit.fragmentsappfromscratch.model.planet;
import org.pursuit.fragmentsappfromscratch.network.PlanetService;
import org.pursuit.fragmentsappfromscratch.network.RetrofitSingleton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main activity";
    private Retrofit retro;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclcer_planets);
        retro = RetrofitSingleton.getInstance();
        PlanetService planetService = retro.create(PlanetService.class);
        Call<Planets> planet = planetService.getPlanetList();
//        planet.enqueue(new Callback<Planets>() {
//            @Override
//            public void onResponse(Call<planet> call, Response<planet> response) {
//                List<planet> planets = response.body().
//                Log.d("on Response: ", response.body().getName());
//
//            }
//
//            @Override
//            public void onFailure(Call<org.pursuit.fragmentsappfromscratch.model.planet> call, Throwable t) {
//
//            }
//        });
        planet.enqueue(new Callback<Planets>() {
            @Override
            public void onResponse(Call<Planets> call, Response<Planets> response) {
                Log.d(TAG, "onResponse: " + response.body().getPlanets().get(0).getImage());
                List<planet> planetList = response.body().getPlanets();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                FAFSAdapter fafsAdapter = new FAFSAdapter(planetList);
                recyclerView.setAdapter(fafsAdapter);
                recyclerView.setLayoutManager(linearLayoutManager);

            }

            @Override
            public void onFailure(Call<Planets> call, Throwable t) {

            }
        });
    }
}
