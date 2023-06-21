package com.example.megatoolsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class SimInfo extends AppCompatActivity {
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim_info);

        textView1 = (TextView) findViewById(R.id.simInfoView);

        //Get the instance of TelephonyManager
        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        //Calling the methods of TelephonyManager the returns the information
        String IMEINumber = tm.getDeviceId();
        String subscriberID = tm.getDeviceId();
        String SIMSerialNumber = tm.getSimSerialNumber();
        String networkCountryISO = tm.getNetworkCountryIso();
        String SIMCountryISO = tm.getSimCountryIso();
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        String softwareVersion = tm.getDeviceSoftwareVersion();
        String voiceMailNumber = tm.getVoiceMailNumber();

        //Get the phone type
        String strphoneType = "";

        int phoneType = tm.getPhoneType();

        switch (phoneType) {
            case (TelephonyManager.PHONE_TYPE_CDMA):
                strphoneType = "CDMA";
                break;
            case (TelephonyManager.PHONE_TYPE_GSM):
                strphoneType = "GSM";
                break;
            case (TelephonyManager.PHONE_TYPE_NONE):
                strphoneType = "NONE";
                break;
        }

        //getting information if phone is in roaming
        boolean isRoaming = tm.isNetworkRoaming();

        String info = "Phone Details:\n";
        info += "\n IMEI Number:" + IMEINumber;
        info += "\n SubscriberID:" + subscriberID;
        info += "\n Sim Serial Number:" + SIMSerialNumber;
        info += "\n Network Country ISO:" + networkCountryISO;
        info += "\n SIM Country ISO:" + SIMCountryISO;
        info += "\n Software Version:" + softwareVersion;
        info += "\n Voice Mail Number:" + voiceMailNumber;
        info += "\n Phone Network Type:" + strphoneType;
        info += "\n In Roaming? :" + isRoaming;

        textView1.setText(info);//displaying the information in the textView
    }

}
