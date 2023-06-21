//package com.example.megatoolsapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//import android.os.Bundle;
//import android.widget.TextView;
//import android.widget.Toast;
//import android.hardware.SensorManager;
//import android.hardware.SensorEventListener;
//import android.hardware.SensorEvent;
//import android.hardware.Sensor;
//
//import java.util.List;
//
//public class SensorAccelerate extends AppCompatActivity {
//    SensorManager sm = null;
//    TextView textView1 = null;
//    List list;
//
//    SensorEventListener sel = new SensorEventListener() {
//        public void onAccuracyChanged(Sensor sensor, int accuracy) {
//        }
//
//        public void onSensorChanged(SensorEvent event) {
//            float[] values = event.values;
//            textView1.setText("x: " + values[0] + "\ny: " + values[1] + "\nz: " + values[2]);
//        }
//    };
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sens_gyro);
//
//        /* Get a SensorManager instance */
//        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
//
//        textView1 = (TextView) findViewById(R.id.textView1);
//
//        list = sm.getSensorList(Sensor.TYPE_ACCELEROMETER);
//        if (list.size() > 0) {
//            sm.registerListener(sel, (Sensor) list.get(0), SensorManager.SENSOR_DELAY_NORMAL);
//        } else {
//            Toast.makeText(getBaseContext(), "Error: No Accelerometer.", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    @Override
//    protected void onStop() {
//        if (list.size() > 0) {
//            sm.unregisterListener(sel);
//        }
//        super.onStop();
//    }
//}
