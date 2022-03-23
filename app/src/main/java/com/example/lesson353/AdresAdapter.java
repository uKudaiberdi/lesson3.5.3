package com.example.lesson353;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdresAdapter extends RecyclerView.Adapter<AdresViewHolder> {
    private ArrayList<String> adres;

    public AdresAdapter(ArrayList<String> adres){
        this.adres = adres;
    }

    @NonNull
    @Override
    public AdresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdresViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adres, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdresViewHolder holder, int position) {
        holder.bind(adres.get(position));

    }

    @Override
    public int getItemCount() {
        return adres.size();
    }
}
