package com.naijab.pokemonear.maps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.naijab.pokemonear.R;

public class MapsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .replace(R.id.frame_container, MapsFragment.newInstance())
          .commit();
    }
  }

}
