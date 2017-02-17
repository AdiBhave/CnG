package com.example.adityadesai.cng;

import android.app.ActionBar;
import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.tjerkw.slideexpandable.library.ActionSlideExpandableListView;
import com.tjerkw.slideexpandable.library.SlideExpandableListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static android.R.id.list;
import static android.os.Build.VERSION_CODES.M;

public class ItemDetailsActivity extends AppCompatActivity {

    private ListView mListView;
    private ItemDetailAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        // Transition
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        // Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mListView = (ListView) findViewById(R.id.item_details_list);
        mListView = (ListView) this.findViewById(R.id.item_details_list);

        ArrayList<ItemDetail> mDetailList=new ArrayList<>();
        mDetailList.add(new ItemDetail("Name A", "Rs 100", "Description A"));
        mDetailList.add(new ItemDetail("Name B", "Rs 100", "Description B"));
        mDetailList.add(new ItemDetail("Name C", "Rs 100", "Description C"));
        mDetailList.add(new ItemDetail("Name D", "Rs 100", "Description D"));
        mDetailList.add(new ItemDetail("Name E", "Rs 100", "Description E"));
        mDetailList.add(new ItemDetail("Name F", "Rs 100", "Description F"));
        mDetailList.add(new ItemDetail("Name G", "Rs 100", "Description G"));
        mDetailList.add(new ItemDetail("Name H", "Rs 100", "Description H"));
        mDetailList.add(new ItemDetail("Name I", "Rs 100", "Description I"));
        mDetailList.add(new ItemDetail("Name J", "Rs 100", "Description J"));

        mAdapter = new ItemDetailAdapter(this, mDetailList);
        mListView.setAdapter(new SlideExpandableListAdapter(
                mAdapter,
                R.id.item_detail_view,
                R.id.item_description
        ));
    }

    // Go back
    public boolean onOptionsItemSelected(MenuItem item){
        Intent i = new Intent(this, ShopDetailsActivity.class);
        startActivity(i);
        return true;

    }
}
