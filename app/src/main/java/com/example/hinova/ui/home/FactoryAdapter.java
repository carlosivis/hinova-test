package com.example.hinova.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hinova.R;
import com.example.hinova.domain.model.FactoryModel;

import java.util.List;

public class FactoryAdapter extends RecyclerView.Adapter<FactoryAdapter.ViewHolder> {
    private final List<FactoryModel> factories;

    public FactoryAdapter(List<FactoryModel> factories) {
        this.factories = factories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_factory, viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public void bind (FactoryModel factory){
            super();
            itemView.;
        }
        public ViewHolder(@NonNull View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
