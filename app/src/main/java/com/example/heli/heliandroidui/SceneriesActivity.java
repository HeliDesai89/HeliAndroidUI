package com.example.heli.heliandroidui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heli on 5/6/2017.
 */

public class SceneriesActivity extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sceneries);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        try {
            topToolBar.setTitle("");
        }
        catch(NullPointerException E){
            Log.e("Heli", "Null Pointer Exception has occured.");
        }
        setSupportActionBar(topToolBar);
        topToolBar.setBackgroundColor(000000);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(SceneriesActivity.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        SubRecycleViewAdapter rcAdapter = new SubRecycleViewAdapter(SceneriesActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //Action for Back Button, which takes to Home page of the app
        if(id == R.id.action_back){
            Intent mainIntent=new Intent(this,MainActivity.class);
            startActivity(mainIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    private List<ItemObject> getAllItemList(){

        //Image array that stores the images of Animals
        int[] imgs= new int[]{R.drawable.scene1, R.drawable.scene2, R.drawable.scene3, R.drawable.scene4};
        List<ItemObject> allItems = new ArrayList<ItemObject>();
        Log.e("Heli", String.valueOf(imgs.length));
        for(int i=0;i<imgs.length;i++){
            String str="Scenery"+String.valueOf(i+1);
            allItems.add(new ItemObject(str, imgs[i]));
        }
        return allItems;
    }

}
