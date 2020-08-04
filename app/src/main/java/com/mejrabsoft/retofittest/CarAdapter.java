package com.mejrabsoft.retofittest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.PluralsRes;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.MyViewHolder> {

    private ArrayList<CarsModel> carsModels;
    private Context context;




    public CarAdapter(Context context,ArrayList<CarsModel> carsModels) {
        this.carsModels = carsModels;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_list_item,parent,false);

      return new CarAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.car_name.setText(carsModels.get(position).getName());
        holder.car_dese.setText(carsModels.get(position).getDesc());

        Picasso.get().load(carsModels.get(position).getImage()).into(holder.car_image);



    }

    @Override
    public int getItemCount() {
        return carsModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView car_image;
        TextView car_name,car_dese;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            car_dese = itemView.findViewById(R.id.car_dese);
            car_name = itemView.findViewById(R.id.car_name);
            car_image = itemView.findViewById(R.id.car_image);
        }
    }
}
