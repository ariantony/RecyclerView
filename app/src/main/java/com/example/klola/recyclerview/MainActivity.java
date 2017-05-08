package com.example.klola.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridLayoutManager Ilayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ItemObject> rowListItem = getAllItemList();
        Ilayout = new GridLayoutManager(MainActivity.this, 4);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycleView);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(Ilayout);

        RecyclerViewAdapter rcAdapter=new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    private List<ItemObject> getAllItemList() {
        List<ItemObject> allItems = new ArrayList<>();
        allItems.add(new ItemObject("United States", R.drawable.one));
        allItems.add(new ItemObject("Canda", R.drawable.two));
        allItems.add(new ItemObject("UK", R.drawable.three));
        allItems.add(new ItemObject("Sweden", R.drawable.four));
        allItems.add(new ItemObject("Indonesia", R.drawable.five));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.six));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.seven));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.eight));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.nine));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.ten));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.twelve));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.fourteen));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.sixteen));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.enambelas));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.tujuhbelas));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.delapanbelas));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.sembilanbelas));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluh));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluhsatu));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluhdua));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluhtiga));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluhempat));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluhlima));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluhenam));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluhtujuh));
        allItems.add(new ItemObject("Saudi Arabia", R.drawable.duapuluhdepalan));
    return allItems;
    }
}
