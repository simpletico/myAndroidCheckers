package com.juajim.android.myandroidcheckers;

import android.widget.ImageView;
import android.view.View;

public class ViewHolder {
    ImageView piece;

    ViewHolder(View v){
        this.piece = (ImageView) v.findViewById(R.id.imageView);
    }
}
