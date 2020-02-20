package com.example.todoapp.ui.gallery;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todoapp.R;

public class MainViewHolder extends RecyclerView.ViewHolder {

TextView textView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.vh_text_view);

    }
}
