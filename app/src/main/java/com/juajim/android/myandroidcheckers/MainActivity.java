package com.juajim.android.myandroidcheckers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.TextView;

import CheckersFramework.Board;
import CheckersFramework.Status;
import CheckersFramework.Point;

public class MainActivity extends AppCompatActivity implements CheckersFramework.View {

    private GridView gridView;
    private BoardAdapter adapter;
    private TextView turntext; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter =
    }

    @Override
    public void invalidate(){
        gridView.invalidate();
        turntext.invalidate();
    }
}
