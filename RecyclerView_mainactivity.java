package com.example.recyclerview;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private Adapter adapter;
    private item_list<Items> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.coffee);
        recyclerView=(RecyclerView)findViewById(R.id.hotdrinks);
        recyclerView=(RecyclerView)findViewById(R.id.colddrinks);
        itemList=new item_list<>();

        for(int i=0;i<3;i++)
        {
            itemList.add(new Items());
        }
        Adapter=new Adapter(this,itemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(Adapter);
    }
}
