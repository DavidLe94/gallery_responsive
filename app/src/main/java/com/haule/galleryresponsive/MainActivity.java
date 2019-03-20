package com.haule.galleryresponsive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private RecyclerView recyclerView;
    private GridView myGrid;
    private ArrayList<String> list;
//    private AdapterImage adapterImage;
    private GridViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
//        recyclerView = findViewById(R.id.list_item_image);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, Utility.calculateNoOfColumns(this, 120)));
        myGrid = findViewById(R.id.myGrid);


        list = new ArrayList<>();
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
        list.add("http://images5.fanpop.com/image/photos/29800000/Blue-Rose-flowers-29859465-400-300.jpg");
//        adapterImage = new AdapterImage(this, list);
//
//        recyclerView.setAdapter(adapterImage);
//        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
//        recyclerView.addItemDecoration(new SpacesItemDecoration(spacingInPixels));

        adapter = new GridViewAdapter(this, list);
        myGrid.setAdapter(adapter);
    }
}
