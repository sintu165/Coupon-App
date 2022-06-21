package com.example.myapplication.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.afdhal_fa.imageslider.ImageSlider;
import com.afdhal_fa.imageslider.model.SlideUIModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ImageSlider homeImageSlider;
    RecyclerView homeNestedRecyclerView;
   ArrayList<parentmodelclass> parentmodelclassArrayList;
    ArrayList<childmodelclass> childmodelclassArrayList;
   ArrayList<childmodelclass> favoritelist;
   ArrayList<childmodelclass> TopSelectionlist;
   ArrayList<childmodelclass> Grocerylist;
   ArrayList<childmodelclass> Fashionlist;
    ArrayList<childmodelclass> ElectonicsAndHomeAppliancelist;
    ParentAdapterClass parentAdapterClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeImageSlider =findViewById(R.id.homeImageSlider);
        ArrayList<SlideUIModel> SlideModel =new ArrayList<>();
        SlideModel.add(new SlideUIModel("https://freepngimg.com/thumb/taj_mahal/33285-7-taj-mahal-clipart-thumb.png", "the taj"));
        SlideModel.add(new SlideUIModel("https://freepngimg.com/thumb/taj_mahal/33285-7-taj-mahal-clipart-thumb.png", "the taj"));
        SlideModel.add(new SlideUIModel("https://freepngimg.com/thumb/taj_mahal/33285-7-taj-mahal-clipart-thumb.png", "the taj"));
        SlideModel.add(new SlideUIModel("https://freepngimg.com/thumb/taj_mahal/33285-7-taj-mahal-clipart-thumb.png", "the taj"));
        homeImageSlider.setImageList(SlideModel);


     /* homeNestedRecyclerView=findViewById(R.id.RV_HomeParent);
       childmodelclassArrayList = new ArrayList<>();
        favoritelist =new ArrayList<>();
        TopSelectionlist=new ArrayList<>();
        Grocerylist =new ArrayList<>();
        Fashionlist =new ArrayList<>();
        ElectonicsAndHomeAppliancelist=new ArrayList<>();

        favoritelist.add(new childmodelclass(R.drawable.couponimage));
        favoritelist.add(new childmodelclass(R.drawable.couponimage));
        favoritelist.add(new childmodelclass(R.drawable.couponimage));
        favoritelist.add(new childmodelclass(R.drawable.couponimage));
        favoritelist.add(new childmodelclass(R.drawable.couponimage));
        favoritelist.add(new childmodelclass(R.drawable.couponimage));

        parentmodelclassArrayList.add(new parentmodelclass("Favorite",favoritelist));

        TopSelectionlist.add(new childmodelclass(R.drawable.couponimage));
        TopSelectionlist.add(new childmodelclass(R.drawable.couponimage));
        TopSelectionlist.add(new childmodelclass(R.drawable.couponimage));
        TopSelectionlist.add(new childmodelclass(R.drawable.couponimage));
        TopSelectionlist.add(new childmodelclass(R.drawable.couponimage));
        TopSelectionlist.add(new childmodelclass(R.drawable.couponimage));

        parentmodelclassArrayList.add(new parentmodelclass("Top Selection",TopSelectionlist));

        parentAdapterClass =new ParentAdapterClass(parentmodelclassArrayList,HomeActivity.this);
        homeNestedRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        homeNestedRecyclerView.setAdapter(parentAdapterClass);
        parentAdapterClass.notifyDataSetChanged();*/
    }
}