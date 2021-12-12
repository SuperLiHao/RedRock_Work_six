package com.example.redrock_work_five;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Author by OkAndGreat，Date on 2021/9/5.
 */
public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.InnerHolder> {
    private final ArrayList<String> data;

    public PagerAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public PagerAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vp, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PagerAdapter.InnerHolder holder, int position) {
        holder.textView.setText(data.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class InnerHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_vp2);
        }
    }
}

