package com.example.megatoolsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class DeviceInfo extends AppCompatActivity {
    TextView infoTextWid;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);


        infoTextWid = findViewById(R.id.deviceInfoTextId);
        infoTextWid .setText(getPhoneModel()) ;
    }

    private String getPhoneModel () {
        Date osInstalledDate = new Date(Build.TIME);
        Log.i("MW",  "time from Build.TIME = " + osInstalledDate .toString());

        // get default display from the windows manager
        Display display = getWindowManager().getDefaultDisplay();

        // declare and initialize a point
        Point size = new Point();

        // store the points related details from the display variable in the size variable
        display.getSize(size);

        // store the point information in integer variables width and height
        // where .x extracts width pixels and .y extracts height pixels
        int width = size.x;
        int height = size.y;

        // Toast will display the width and height values
        Toast.makeText(getApplicationContext(), "Width: " + width + " Pixels , Height: " + height + " Pixels", Toast.LENGTH_LONG).show();


        String  details =  "VERSION.RELEASE : "+ Build.VERSION.RELEASE
                +"\nVERSION.INCREMENTAL : "+Build.VERSION.INCREMENTAL
                +"\nVERSION.SDK.NUMBER : "+Build.VERSION.SDK_INT
                +"\nBOARD : "+Build.BOARD
                +"\nBOOTLOADER : "+Build.BOOTLOADER
                +"\nBRAND : "+Build.BRAND
                +"\nCPU_ABI : "+Build.CPU_ABI
                +"\nCPU_ABI2 : "+Build.CPU_ABI2
                +"\nDISPLAY : "+Build.DISPLAY
                +"\nFINGERPRINT : "+Build.FINGERPRINT
                +"\nHARDWARE : "+Build.HARDWARE
                +"\nHOST : "+Build.HOST
                +"\nID : "+Build.ID
                +"\nMANUFACTURER : "+Build.MANUFACTURER
                +"\nMODEL : "+Build.MODEL
                +"\nPRODUCT : "+Build.PRODUCT
                +"\nSERIAL : "+Build.SERIAL
                +"\nTAGS : "+Build.TAGS
                +"\nTIME : "+Build.TIME
                +"\nTYPE : "+Build.TYPE
                +"\nUNKNOWN : "+Build.UNKNOWN
                +"\nUSER : "+Build.USER
                +"\nScreen Size: width="+  width + ", height = " + height
                +"\nOS Build TIME = " + osInstalledDate .toString();
        return details ;
    }
}