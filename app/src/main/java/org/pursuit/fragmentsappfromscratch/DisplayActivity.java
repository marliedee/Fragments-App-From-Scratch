package org.pursuit.fragmentsappfromscratch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Bundle bundle = new Bundle();
        bundle.putString("name","some text");
        MainFragment myFrag = new MainFragment();
        myFrag.setArguments(bundle);

    }
}
