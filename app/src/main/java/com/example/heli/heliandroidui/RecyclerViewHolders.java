package com.example.heli.heliandroidui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by Heli on 5/6/2017.
 */

public class RecyclerViewHolders  extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener {
    public TextView imgName;
    public ImageView imgPhoto;


    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
        imgName = (TextView)itemView.findViewById(R.id.img_name);
        imgPhoto = (ImageView)itemView.findViewById(R.id.img_photo);
    }

    @Override
    public void onClick(View view) {
        Log.e("Heli", "Clicking a card now!");

        Intent myIntent=new Intent();
        Context myContext2=view.getContext();
        if(this.getPosition()==0) {
            myIntent.setClass(myContext2, AnimalActivity.class);
            myContext2.startActivity(myIntent);
        }

        else if(this.getPosition()==1){
            myIntent.setClass(myContext2, ArchitectureActivity.class);
            myContext2.startActivity(myIntent);
        }

        else if(this.getPosition()==2){
            myIntent.setClass(myContext2, FoodActivity.class);
            myContext2.startActivity(myIntent);
        }

        else if(this.getPosition()==3){
            myIntent.setClass(myContext2, PostersActivity.class);
            myContext2.startActivity(myIntent);
        }

        else if(this.getPosition()==4){
            myIntent.setClass(myContext2, SceneriesActivity.class);
            myContext2.startActivity(myIntent);
        }
    }

    @Override
    public boolean onLongClick(View view){

        Log.e("Heli", "Long Clicking now!");

       // Toast.makeText(view.getContext(), "LONG CLICK = " + this.getPosition(), Toast.LENGTH_SHORT).show();

        final Context myContext2=view.getContext();

        AlertDialog.Builder builder = new AlertDialog.Builder(myContext2);

        final AlertDialog dialog = builder.create();

        LayoutInflater inflater = (LayoutInflater) myContext2.getSystemService(LAYOUT_INFLATER_SERVICE);

        View dialogLayout = inflater.inflate(R.layout.popup_layout, null);
        dialog.setView(dialogLayout);
        dialog.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));

        dialog.show();

        if(this.getPosition()==0){
            int[] imgs= new int[]{R.drawable.ani1, R.drawable.ani2, R.drawable.ani3, R.drawable.ani4, R.drawable.ani5, R.drawable.ani6};
            int[] imgview=new int[]{R.id.imageViewpopup1, R.id.imageViewpopup2, R.id.imageViewpopup3, R.id.imageViewpopup4, R.id.imageViewpopup5};

            for(int i=0;i<5;i++){
                ImageView image = (ImageView) dialog.findViewById(imgview[i]);
                image.setImageResource(imgs[i]);
            }
        }

        else if(this.getPosition()==1){
            int[] imgs= new int[]{R.drawable.arch1, R.drawable.arch2, R.drawable.arch3, R.drawable.arch4};
            int[] imgview=new int[]{R.id.imageViewpopup1, R.id.imageViewpopup2, R.id.imageViewpopup3, R.id.imageViewpopup4, R.id.imageViewpopup5};

            for(int i=0;i<4;i++){
                ImageView image = (ImageView) dialog.findViewById(imgview[i]);
                image.setImageResource(imgs[i]);
            }
        }

        else if(this.getPosition()==2){
            int[] imgs= new int[]{R.drawable.foo1, R.drawable.foo2, R.drawable.foo3, R.drawable.foo4, R.drawable.foo5};
            int[] imgview=new int[]{R.id.imageViewpopup1, R.id.imageViewpopup2, R.id.imageViewpopup3, R.id.imageViewpopup4, R.id.imageViewpopup5};

            for(int i=0;i<4;i++){
                ImageView image = (ImageView) dialog.findViewById(imgview[i]);
                image.setImageResource(imgs[i]);
            }
        }

        else if(this.getPosition()==3){
            int[] imgs= new int[]{R.drawable.post1, R.drawable.post2, R.drawable.post3, R.drawable.post4, R.drawable.post5};
            int[] imgview=new int[]{R.id.imageViewpopup1, R.id.imageViewpopup2, R.id.imageViewpopup3, R.id.imageViewpopup4, R.id.imageViewpopup5};

            for(int i=0;i<4;i++){
                ImageView image = (ImageView) dialog.findViewById(imgview[i]);
                image.setImageResource(imgs[i]);
            }
        }

        else if(this.getPosition()==4){
            int[] imgs= new int[]{R.drawable.scene1, R.drawable.scene2, R.drawable.scene3, R.drawable.scene4, R.drawable.scene5};
            int[] imgview=new int[]{R.id.imageViewpopup1, R.id.imageViewpopup2, R.id.imageViewpopup3, R.id.imageViewpopup4, R.id.imageViewpopup5};

            for(int i=0;i<4;i++){
                ImageView image = (ImageView) dialog.findViewById(imgview[i]);
                image.setImageResource(imgs[i]);
            }
        }
        return true;
    }
}
