package com.juajim.android.myandroidcheckers;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context
import CheckersFramework.Board;
import CheckersFramework.Point;
import CheckersFramework.View;

public class BoardAdapter extends BaseAdapter {
    public Context context;
    public Board board;

    public BoardAdapter(Context context){
        this.context = context;
        this.board = new Board(10);
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public int getCount(){
        return board.getSize() * board.getSize();
    }

    @Override
    public Object getItem(int i){
        board.getPiece(new Point(i%10, i / 10));
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        View row = view;
        ViewHolder holder;
        int image = R.drawable.checkersboard;
        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_cell, viewGroup, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
    }

}
