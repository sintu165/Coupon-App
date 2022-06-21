package com.example.myapplication.Home;

import static com.example.myapplication.R.layout.child_rv_layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class ChildAdapterClass extends RecyclerView.Adapter<ChildAdapterClass.ViewHolder> {
    List<childmodelclass> childmodelclassList;

    public ChildAdapterClass(List<childmodelclass> childmodelclassList, Context context) {
        this.childmodelclassList = childmodelclassList;
        this.context = context;
    }

    Context context;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(child_rv_layout,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.iv_child_item.setImageResource(childmodelclassList.get(position).image);

    }

    @Override
    public int getItemCount() {
        return childmodelclassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_child_item;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_child_item=itemView.findViewById(R.id.iv_child_item);
        }
    }
}
