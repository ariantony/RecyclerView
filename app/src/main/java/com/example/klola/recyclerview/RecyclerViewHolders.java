package com.example.klola.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by klola on 5/6/2017.
 */

public class RecyclerViewHolders
        extends RecyclerView.ViewHolder
        implements View.OnClickListener {

       public TextView countryName;
       public ImageView countrPhoto;

        public RecyclerViewHolders(View itemView){
            super (itemView);
            itemView.setOnClickListener(this);
            countryName = (TextView)itemView.findViewById(R.id.country_name);
            countrPhoto = (ImageView)itemView.findViewById(R.id.countryPhoto);
        }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Click Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
