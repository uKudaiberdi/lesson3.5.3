package com.example.lesson353;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment {


    private AdresAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.adres);
        ArrayList<String> adres = new ArrayList<>();
        adres.add("Samolenko55");
        adres.add("Samolenko2a");
        adres.add("Samolenko32");
        adres.add("Garajnaya23");
        adres.add("Samolenko2b");
        adapter = new AdresAdapter(adres);
        recyclerView.setAdapter(adapter);
    }
}