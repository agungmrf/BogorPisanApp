package com.example.a1911500518_agungmaruf_tugas4_ae.JavaHotel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1911500518_agungmaruf_tugas4_ae.R;

public class HarrisHotel extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_harris_hotel, container, false);
        return v;
    }
}