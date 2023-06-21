package com.example.megatoolsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.io.IOException;

public class Airplane extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airplane);


        textView = findViewById(R.id.airplaneTextView);
        checkAirplaneMode();
    }

    private void checkAirplaneMode() {
        if (isAirplaneModeOn(getApplicationContext())) {
            textView.setText("Airplane Mode is working\nCurrent Status: Enabled");
        } else {
            textView.setText("Airplane Mode is working\nCurrent Status:  Disabled");
        }
    }

    private static boolean isAirplaneModeOn(Context context) {
        return Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;
    }

}
