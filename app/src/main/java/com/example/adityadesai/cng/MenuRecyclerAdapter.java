package com.example.adityadesai.cng;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.data;
import static android.R.attr.targetActivity;

/**
 * Created by adityadesai on 11/02/17.
 */

public class MenuRecyclerAdapter extends RecyclerView.Adapter<MenuRecyclerAdapter.MenuHolder>{

    private static ArrayList<MenuItem> mMenuItems;

    public static class MenuHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mItemName;
        private MenuItem mMenuItem;

        public MenuHolder(View v) {
            super(v);

            mItemName = (TextView) v.findViewById(R.id.industry_name);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Yet to implement
        }

        public void bindIndustry(MenuItem menuItem) {
            mMenuItem = menuItem;
            mItemName.setText(menuItem.getItemName());
        }
    }

    public MenuRecyclerAdapter(ArrayList<MenuItem> menuItem) {
        mMenuItems = menuItem;
    }

    @Override
    public MenuRecyclerAdapter.MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.industry_item, parent, false);
        return new MenuHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(MenuRecyclerAdapter.MenuHolder holder, int position) {
        MenuItem menuItem = mMenuItems.get(position);
        holder.bindIndustry(menuItem);
    }

    @Override
    public int getItemCount() {
        return mMenuItems.size();
    }
}
