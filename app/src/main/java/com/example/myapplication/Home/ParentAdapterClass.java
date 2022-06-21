package com.example.myapplication.Home;

import static com.example.myapplication.R.layout.child_rv_layout;
import static com.example.myapplication.R.layout.rv_parent_layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ParentAdapterClass extends RecyclerView.Adapter<ParentAdapterClass.ViewHolder> {
    List<parentmodelclass> parentmodelclassList;

    public ParentAdapterClass(ArrayList<parentmodelclass> childmodelclassList, Context context) {
        this.parentmodelclassList = parentmodelclassList;
        this.context = context;
    }

    Context context;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(rv_parent_layout,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       // holder.iv_child_item.setImageResource(parentmodelclassList.get(position).image);
        holder.tv_parent_title.setText(parentmodelclassList.get(position).title);
        ChildAdapterClass childAdapterClass = new ChildAdapterClass(parentmodelclassList.get(position).childmodelclassList, context);
        holder.rv_child.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.rv_child.setAdapter(childAdapterClass);
        childAdapterClass.notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return parentmodelclassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       // ImageView iv_child_item;
        RecyclerView rv_child;
        TextView tv_parent_title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           // iv_child_item=itemView.findViewById(R.id.iv_child_item);
            rv_child = itemView.findViewById(R.id.rv_child);
            tv_parent_title=itemView.findViewById(R.id.tv_parent_title);


        }
    }
}
