package com.example.heli.heliandroidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;

import java.util.List;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/*App Name: HeliAndroidUI

Performs all Functionality mentioned in Interaction_Wireframe.pdf
1) Home page of Activity scrolles through the multiple cards of the images
2) Single Tap on any particular card will take through the 1:1 images of particular genre
3) Tap on 'Back' button will return to the home screen
4) Long press will pop up the preview. Can slide left and right to see more images

Activity Classes are defined as follow:
Main Activity: For Home Screen of the app

Sub Activities: The activities that get called on single tap on a card
1) AnimalActivity
2) ArchitectureActivity
3) FoodActivity
4) PosterActivity
5) SceneriesActivity

RecycleView Adapter: A Recycle View Adapter

Recycle View Holder: Holder class for Recycle Adapter

ItemObject: Get/Set methods for Image Name and Image

*/
public class MainActivity extends AppCompatActivity {
    private LinearLayoutManager lLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(null);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(MainActivity.this);


        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
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

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Animal", R.drawable.ani1));
        allItems.add(new ItemObject("Architecture", R.drawable.arch1));
        allItems.add(new ItemObject("Food", R.drawable.food1));
        allItems.add(new ItemObject("Posters", R.drawable.post1));
        allItems.add(new ItemObject("Sceneries", R.drawable.scene1));

        return allItems;
    }
}

