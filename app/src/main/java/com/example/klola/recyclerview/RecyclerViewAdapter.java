package com.example.klola.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by klola on 5/6/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    private List <ItemObject> itemlist;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemlist){
        this.itemlist = itemlist;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View LayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(LayoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position){
        holder.countryName.setText(itemlist.get(position).getName());
        holder.countrPhoto.setImageResource(itemlist.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemlist.size();
    }
}
