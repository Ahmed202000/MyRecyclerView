package com.example.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listRecycler;
    private RecyclerView list;
    private Adapter_RecycleView adapterrecycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listRecycler=findViewById(R.id.list);
        listRecycler.setHasFixedSize(true);
        RecyclerView.LayoutManager linearLayoutManager=new LinearLayoutManager(this);
        RecyclerView.LayoutManager gridLayout=new GridLayoutManager(this,2);
        listRecycler.setLayoutManager(linearLayoutManager);
        adapterrecycleView =new Adapter_RecycleView(this);
        listRecycler.setAdapter(adapterrecycleView);
    }
}
