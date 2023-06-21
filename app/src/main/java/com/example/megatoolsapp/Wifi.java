package com.example.megatoolsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Wifi extends AppCompatActivity {
    private TextView wifiModule, wifiCondition, wifiStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        Toast.makeText(this, "WiFi page is creating", Toast.LENGTH_SHORT).show();

        wifiModule = findViewById(R.id.showWifiModule);
        wifiCondition = findViewById(R.id.showWifiCondition)  ;
        wifiStatus = findViewById(R.id.showWifiState);

//        tv.setText("Activity: WiFi Functionality and Status \nCondition: WiFi is Working\nState: WiFi is enabled");

        WifiManager wifiManager;
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        if (wifiManager != null) {
            // WiFi is available
            Toast.makeText(this, "WiFi module exists", Toast.LENGTH_SHORT).show();
            wifiModule.setText("WiFi Module: Exists");
            wifiCondition.setText("Wifi Condition: Working");
        } else {
            // WiFi is not available
            Toast.makeText(this, "No WiFi module", Toast.LENGTH_SHORT).show();
            wifiModule.setText("WiFi Module: No Exist");
            wifiCondition.setText("Wifi Condition: Not Working");

        }


//        if (wifiManager.isWifiEnabled()) {
//            // WiFi is enabled and working
//            Toast.makeText(this, "WiFi is enable", Toast.LENGTH_SHORT).show();
//            wifiStatus.setText("WiFi State: Enabled");
//        } else {
//            // WiFi is not working
//            Toast.makeText(this, "WiFi is disabled", Toast.LENGTH_SHORT).show();
//            wifiStatus.setText("WiFi State: Disabled");
//        }
    };
}