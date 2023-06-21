package com.example.megatoolsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SensorsList extends AppCompatActivity implements View.OnClickListener {

    private static final String LOG_TAG = "list_all_sensors";
    private Button sensorListBtn;
    private TextView FinalSensorList;

    private SensorManager sensorManager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors_list);
        sensorListBtn = findViewById(R.id.sensorsListBtn);
        sensorListBtn.setOnClickListener(this);

        FinalSensorList = findViewById(R.id.sensorsListView);
        FinalSensorList.setText(mySensorsList());

    }

    public  void onClick(View arg0){
        Toast.makeText(this, "Discovering device sensors..", Toast.LENGTH_SHORT).show();
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);

        String NewList = "";
        int MyListIndex = 1;

        for(Sensor sensor:sensorList){
            Log.i(LOG_TAG,"Sensor Name: " + sensor.getName() + " | Sensor Type: " + sensor.getType());
//            FinalSensorList.setText("\nSensor Name: " + sensor.getName() + " | Sensor Type: " + sensor.getType());

            NewList = NewList  + MyListIndex +  ". Sensor Name: " + sensor.getName() + "\nSensor Type: " + sensor.getType() +"\n\n";
            MyListIndex +=1;


        }
        FinalSensorList.setText(NewList);
        Toast.makeText(this, "Finished searching.", Toast.LENGTH_SHORT).show();

    }

    public CharSequence mySensorsList(){
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);

        for(Sensor sensor:sensorList){
            Log.i(LOG_TAG,"Sensor Name: " + sensor.getName() + " | Sensor Type: " + sensor.getType());
        }
//        Toast.makeText(this, "Finished searching. 2", Toast.LENGTH_SHORT).show();
        return null;
    }

}