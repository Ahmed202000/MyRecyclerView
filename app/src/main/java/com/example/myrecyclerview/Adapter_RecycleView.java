package com.example.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Adapter_RecycleView extends RecyclerView.Adapter<Adapter_RecycleView.ViewHolder> {

    private Context context;
    public Adapter_RecycleView(Context context){

        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapterrecyclerview,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder  holder, int i) {

        holder.name.setText("Ahmed");
        holder.titale.setText("Google");
        holder .image.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {

        TextView name,titale;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            titale=itemView.findViewById(R.id.titale);
            image=itemView.findViewById(R.id.image);

        }
    }
}
