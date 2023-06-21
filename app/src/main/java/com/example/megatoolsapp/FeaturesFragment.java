package com.example.megatoolsapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PublicKey;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FeaturesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FeaturesFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Context applicationContext;

    public FeaturesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FeaturesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FeaturesFragment newInstance(String param1, String param2) {
        FeaturesFragment fragment = new FeaturesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_features, container, false);


        ImageView airplaneFun = view.findViewById(R.id.airplaneTextIcon);
        airplaneFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Airplane.class);
                startActivity(intent);
            }
        });

        ImageView batteryFun = view.findViewById(R.id.batteryTextIcon);
        batteryFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Battery.class);
                startActivity(intent);
            }
        });

        ImageView bluetoothTest = view.findViewById(R.id.bluetoothTextIcon);
        bluetoothTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Bluetooth.class);
                startActivity(intent);
            }
        });



        ImageView brightnessFun = view.findViewById(R.id.brightnessTextIcon);
        brightnessFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Brightness.class);
                startActivity(intent);
            }
        });

        ImageView flashFun = view.findViewById(R.id.flashTextIcon);
        flashFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Flash.class);
                startActivity(intent);
            }
        });

        ImageView gpsFun = view.findViewById(R.id.gpsTextIcon);
        gpsFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Location.class);
                startActivity(intent);
            }
        });



        ImageView internetFun = view.findViewById(R.id.internetTextIcon);
        internetFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Internet.class);
                startActivity(intent);
            }
        });

        ImageView securityFun = view.findViewById(R.id.securityTextIcon);
        securityFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Security.class);
                startActivity(intent);
            }
        });

        ImageView soundFun = view.findViewById(R.id.soundTextIcon);
        soundFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sound.class);
                startActivity(intent);
            }
        });



        ImageView touchFun = view.findViewById(R.id.touchTextIcon);
        touchFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Touch.class);
                startActivity(intent);
            }
        });

        ImageView vibrationFun = view.findViewById(R.id.vibrationTextIcon);
        vibrationFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Vibration.class);
                startActivity(intent);
            }
        });

        ImageView wifiFun = view.findViewById(R.id.wifiTextIcon);
        wifiFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Wifi.class);
                startActivity(intent);
            }
        });



        ImageView deviceInfo = view.findViewById(R.id.phoneInfoTextIcon);
        deviceInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DeviceInfo.class);
                startActivity(intent);
            }
        });

        ImageView simInfo = view.findViewById(R.id.simInfoTextIcon);
        simInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SimInfo.class);
                startActivity(intent);
            }
        });

        ImageView sensorsTest = view.findViewById(R.id.sensorTestTextIcon);
        sensorsTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SensorTest.class);
                startActivity(intent);
            }
        });



        ImageView scannerList = view.findViewById(R.id.sensorsListTextIcon);
        scannerList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SensorsList.class);
                startActivity(intent);
            }
        });

        ImageView cameraTest = view.findViewById(R.id.cameraTextIcon);
        cameraTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Camera.class);
                startActivity(intent);
            }
        });

        ImageView videoTest = view.findViewById(R.id.videoTextIcon);
        videoTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Video.class);
                startActivity(intent);
            }
        });


        return view;

    }

}
