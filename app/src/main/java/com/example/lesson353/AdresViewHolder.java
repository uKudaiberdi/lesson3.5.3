package com.example.lesson353;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdresViewHolder extends RecyclerView.ViewHolder {
    private TextView adres;

    public AdresViewHolder(@NonNull View itemView) {
        super(itemView);
        adres = itemView.findViewById(R.id.adres);
    }
    public void bind(String adres) {
        this.adres.setText(adres);
    }
}
