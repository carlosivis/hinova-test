package com.example.hinova.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.domain.model.Factory;
import com.example.hinova.R;

import java.util.List;

public class FactoryAdapter extends RecyclerView.Adapter<FactoryAdapter.ViewHolder> {
    private final List<Factory> factories;

    public FactoryAdapter(List<Factory> factories) {
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

        Factory factory = factories.get(position);
        holder.bind(factory);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView description = itemView.findViewById(R.id.factoryDescription);
        TextView name = itemView.findViewById(R.id.factoryName);
        TextView phone = itemView.findViewById(R.id.factoryPhone);

        public void bind (Factory factory){
            description.setText(factory.getDescricaoCurta());
            name.setText(factory.getNome());
            phone.setText(factory.getTelefone1());

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
