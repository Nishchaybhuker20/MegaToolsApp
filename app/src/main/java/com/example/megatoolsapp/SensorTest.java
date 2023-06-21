package com.example.megatoolsapp;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SensorTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_test);


    }


    public void getAccelMeth(View view) {

        Intent intent = new Intent(getApplicationContext(), SensAcceletro.class);
        intent.putExtra("a", 1);
        startActivity(intent);
    }

    public void getHumMeth(View view) {
        Intent intent = new Intent(getApplicationContext(), SensHum.class);
        intent.putExtra("b", 2);
        startActivity(intent);
    }


    public void getGyroMeth(View view) {

        Intent intent = new Intent(getApplicationContext(), SensGyro.class);
        intent.putExtra("c", 3);
        startActivity(intent);

    }

    public void getRotationMeth(View view) {

        Intent intent = new Intent(getApplicationContext(), SensRotation.class);
        intent.putExtra("e",4);
        startActivity(intent);
    }

    public void getGravityMeth(View view) {
        Intent intent = new Intent(getApplicationContext(), SensGravity.class);
        intent.putExtra("f",6);
        startActivity(intent);
    }

    public void getProxMeth(View view) {
        Intent i = new Intent(getApplicationContext(), SensProx.class);
        i.putExtra("g",7);
        startActivity(i);
    }

    public void getOrientMeth(View view) {
    }

    public void getMegnoMeth(View view) {
    }

    public void getLightMeth(View view) {
    }

    public void getAmbientMeth(View view) {
    }

    public void getPressureMeth(View view) {
    }
}